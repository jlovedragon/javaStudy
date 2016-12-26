package com.guice;

import com.google.inject.Binder;
import com.google.inject.Module;

/**
 * Created by riverxu on 2016/3/25.
 */
public class MyModule  implements Module {

    public void configure(Binder binder) {

        System.out.println("module configure");
        binder.bind(PrintService.class).to(PrintServiceImpl.class);
    }
}
