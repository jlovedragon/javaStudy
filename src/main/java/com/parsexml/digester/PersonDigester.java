package com.parsexml.digester;

import org.apache.commons.digester.Digester;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by riverxu on 2016/3/29.
 */
public class PersonDigester {

    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        URL url = classLoader.getResource("person.xml");

        Digester digester = new Digester();
        digester.setValidating(false);

        digester.addObjectCreate("parents", ArrayList.class);

        digester.addObjectCreate("parents/parent", Parent.class);
        digester.addSetProperties("parents/parent");
        digester.addSetNext("parents/parent", "add");

        digester.addObjectCreate("parents/parent/child", Child.class);
        digester.addSetProperties("parents/parent/child");
        digester.addSetNext("parents/parent/child", "addChild");
        digester.addSetProperties("parents/parent/child", "xid", "id");

        digester.addBeanPropertySetter("parents/parent/child", "name");

        try {
            List<Parent> parents = (ArrayList<Parent>) digester.parse(url);

            for (Parent parent : parents) {
                System.out.println("parent id :" + parent.getId());

                for (Child child : parent.getChildren()) {
                    System.out.println(child);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
