package com.tencent;

import java.util.HashMap;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author riverxu
 * @create 2016-06-20-6:42.
 */
public class TestList {

    public static void main(String[] args) {
        Map<String, Object> result = null;


        Map<String, Object> aa = new HashMap<String, Object>();

        aa.put("code", 123);

        result = aa;


        System.out.println(result);
    }
}
