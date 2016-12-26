package com.sourcecode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ${DESCRIPTION}
 *
 * @author riverxu
 * @create 2016-04-11-12:19.
 */
public class ListTest {

    public static void main(String[] args) {
        List aList = new ArrayList();
        Set set = new HashSet();

//        aList.add(null);
//        aList.add(null);

        aList.add(aList);
        aList.add(aList);

        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i));
        }

        System.out.println(aList.toString());
    }

}
