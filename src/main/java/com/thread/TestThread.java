package com.thread;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ${DESCRIPTION}
 *
 * @author riverxu
 * @create 2016-04-13-2:56.
 */
public class TestThread implements Runnable {
    private ArrayList<String> aa = new ArrayList<String>();

    @Override
    public void run() {
        aa.set(0, "Thread");
    }

    public String get() {
        aa.add("ThreadMain");
        System.out.println(aa.get(0).toString());
//        Iterator it = aa.iterator();

        return aa.get(0).toString();
    }

    public static void main(String[] args) throws InterruptedException {
        TestThread t = new TestThread();
        new Thread(t).start();

        System.out.println(t.get());
    }
}
