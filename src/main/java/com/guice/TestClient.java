package com.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import junit.framework.TestCase;

/**
 * Created by riverxu on 2016/3/25.
 */
public class TestClient extends TestCase {

    public void testPrintString() {

        // 先用module绑定具体的服务类
        MyModule mo = new MyModule();

        System.out.println("======================");

        // 将客户需要的服务放入注射器里面
        Injector in = Guice.createInjector(mo);

        Client ci = in.getInstance(Client.class);

        ci.printString();

//        Client client = new Client();
//
//        // 用注射器将服务注入到客户对象里面
//        in.injectMembers(client);
//
//        // 客户对象调用服务
//        client.printString();
    }
}
