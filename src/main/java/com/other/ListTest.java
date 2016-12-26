package com.other;

import org.apache.commons.collections.map.HashedMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author riverxu
 * @create 2016-12-19-21:10.
 */
public class ListTest {

    public static void main(String[] args) {

        List<Map<String, Object>> clist = new ArrayList<Map<String, Object>>();

        Map<String, Object> item1 = new HashedMap();
        item1.put("info_type", 0);
        item1.put("msg", 1);
        clist.add(item1);

        Map<String, Object> item2 = new HashedMap();
        item2.put("info_type", 0);
        item2.put("msg", 2);
        clist.add(item2);

        Map<String, Object> item3 = new HashedMap();
        item3.put("info_type", 1);
        item3.put("msg", 3);
        clist.add(item2);


        List<Map<String, Object>> courseList = new ArrayList<Map<String, Object>>();

        for (Map<String, Object> c : clist) {
            Number infoType = (Number) c.get("info_type");
            if (infoType.intValue() == 0) {
                courseList.add(c);
            }
        }

        for (Map<String, Object> item : courseList) {
            item.put("dd", 100);
        }

        System.out.println(clist);
    }
}
