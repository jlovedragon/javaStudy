package com.tencent;

/**
 * Created by riverxu on 2016/3/24.
 */
public class ReadFile {
    public static void main(String[] args) {
        System.out.println(ReadFile.class.getResource("/test.xml"));
    }
}
