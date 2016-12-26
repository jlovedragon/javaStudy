package com.sourcecode;

/**
 * Created by riverxu on 2016/4/1.
 */
public class StringTest {
    public static void main(String[] args) {

        String a = "abcd";
        String b = "abcd";
        String c = new String("abcd");
        String d = new String("abcd");

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(c == d);
        System.out.println(c.equals(d));
        System.out.println(a == c);
        System.out.println(a.equals(c));
    }
}
