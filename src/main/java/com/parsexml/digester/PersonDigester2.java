package com.parsexml.digester;

import org.apache.commons.digester.Digester;
import org.apache.commons.digester.RuleSetBase;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by riverxu on 2016/3/29.
 */
public class PersonDigester2 {

    public static void main(String[] args) throws IOException, SAXException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream source = classLoader.getResourceAsStream("person.xml");

        System.out.println("source ============" + source);

        List<Parent> parents = new ArrayList<Parent>();

        Digester digester = new Digester();
        digester.addRuleSet(new ParentsSpecRule());
        digester.push(parents);
        digester.parse(source);

        for (Parent parent : parents) {
            System.out.println("parent id:" + parent.getId());

            for (Child child : parent.getChildren()) {
                System.out.println(child);
            }
        }
    }
}

class ParentsSpecRule extends RuleSetBase {
    @Override
    public void addRuleInstances(Digester digester) {
        digester.setValidating(false);

        digester.addObjectCreate("parents/parent", Parent.class);
        digester.addSetProperties("parents/parent");

        digester.addSetNext("parents/parent", "add");

        digester.addObjectCreate("parents/parent/child", Child.class);
        digester.addSetProperties("parents/patent/child");
        digester.addSetNext("parents/parent/child", "addChild");

        digester.addSetProperties("parents/parent/child", "xid", "id");
        digester.addBeanPropertySetter("parents/parent/child", "name");
    }
}
