package com.other;

import java.util.HashMap;

/**
 * ${DESCRIPTION}
 *
 * @author riverxu
 * @create 2016-10-08-19:31.
 */
public class MapTest {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        Integer number = map.put("One", 1);

        System.out.println(number);
    }
}
