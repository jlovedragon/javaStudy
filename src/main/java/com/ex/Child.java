package com.ex;

/**
 * Created by riverxu on 2016/3/28.
 */
public class Child extends Parent {

    @Override
    public void test() {
        super.test();
    }

    public static void main(String[] args) {
        Child child = new Child();

        child.test();
    }

    @Override
    protected void sayHello() {
        System.out.println("hello, child");
    }

}
