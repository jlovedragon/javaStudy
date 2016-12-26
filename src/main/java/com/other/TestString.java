package com.other;

/**
 * ${DESCRIPTION}
 *
 * @author riverxu
 * @create 2016-09-18-9:01.
 */
public class TestString {
    public static void main(String[] args) {

        String errMsg = new String("aa");

        changeString(errMsg);

        System.out.println(errMsg);

    }

    public static void changeString(String errMsg) {
        errMsg = "hello";
    }
}
