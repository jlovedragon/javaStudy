package com.other;

import java.util.*;

/**
 * ${DESCRIPTION}
 *
 * @author riverxu
 * @create 2016-09-19-8:45.
 */
public class ConfigurationTest {


    public static void main(String[] args) {

        List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();
        Map<String, Object> one = new HashMap<String, Object>();
        one.put("number", 1L);
        Map<String, Object> two = new HashMap<String, Object>();
        two.put("number", 2L);
        rows.add(one);
        rows.add(two);


        System.out.println("rows.size = " + rows.size());

        Iterator iter = rows.iterator();

        while (iter.hasNext()) {
            Map<String, Object> row = (Map<String, Object>) iter.next();

            Number key = (Number) row.get("number");

            if (key.longValue() == 1L) {
                iter.remove();
            }

        }


        System.out.println("rows.size = " + rows.size());
    }
}
