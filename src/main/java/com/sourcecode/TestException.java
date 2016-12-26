package com.sourcecode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * ${DESCRIPTION}
 *
 * @author riverxu
 * @create 2016-04-07-9:37.
 */
public class TestException {
    public static void main(String[] args) {
        File f = new File("d:/LoL.exe");

        try {
            System.out.println("试图打开 d:/LOL.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
        } catch (FileNotFoundException e) {
            System.out.println("d:/LOL.exe不存在");
            e.printStackTrace();
        }

    }
}
