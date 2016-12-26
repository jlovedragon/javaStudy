package com.sourcecode;

/**
 * ${DESCRIPTION}
 *
 * @author riverxu
 * @create 2016-04-07-3:44.
 */
public class EnumTest {


    enum Color {RED, BLUE, GREEN}
    enum Season {SPRING, SUMMER}

    public static void main(String[] args) {
        System.out.println(Color.RED.ordinal());

        System.out.println(Color.RED.compareTo(Color.RED));
//        System.out.println(Color.RED.compareTo(Season.SPRING));
    }
}
