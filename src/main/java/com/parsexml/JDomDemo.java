package com.parsexml;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import java.io.IOException;
import java.util.List;

/**
 * Created by riverxu on 2016/3/28.
 */
public class JDomDemo implements XmlDocument {

    public void parserXml(String fileName) {

        SAXBuilder builder = new SAXBuilder();

        try {
            Document document = builder.build(JDomDemo.class.getResourceAsStream(fileName));
            Element users = document.getRootElement();
            List userList = users.getChildren("user");

            for (int i = 0; i < userList.size(); i++) {
                Element user = (Element) userList.get(i);
                List userInfo = user.getChildren();

                for (int j = 0; j < userInfo.size(); j++) {
                    System.out.println(((Element) userInfo.get(j)).getName()
                    + ": " + ((Element) userInfo.get(j)).getValue());
                }
                System.out.println();
            }
        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JDomDemo jDomDemo = new JDomDemo();
        jDomDemo.parserXml("/test.xml");
    }
}
