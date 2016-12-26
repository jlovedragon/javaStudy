package com.guice;

import com.google.inject.Inject;

/**
 * Created by riverxu on 2016/3/25.
 */
public class Client {

    private String str = "Hello World";
    private PrintService service;

    @Inject
    public Client(String str, PrintService service) {
        System.out.println("I am client injector");
    }

    @Inject
    void injectPrintService(PrintService service) {
        this.service = service;
    }

    void printString() {
        service.print(str);
    }
}
