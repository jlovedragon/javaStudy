package com.parsexml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.Iterator;

/**
 * Created by riverxu on 2016/3/28.
 */
public class Dom4jDemo implements XmlDocument {
   public void parserXml(String fileName) {
      SAXReader saxReader = new SAXReader();

      try {
         Document document = saxReader.read(Dom4jDemo.class.getResourceAsStream(fileName));
         Element users = document.getRootElement();

         for (Iterator i = users.elementIterator(); i.hasNext();) {
            Element user = (Element) i.next();
            for (Iterator j = user.elementIterator(); j.hasNext();) {
               Element node = (Element) j.next();
               System.out.println(node.getName() + ": " + node.getText());
            }

            System.out.println();
         }
      } catch (DocumentException e) {
         System.out.println(e.getMessage());
      }
   }

   public static void main(String[] args) {
      Dom4jDemo dom4jDemo = new Dom4jDemo();
      dom4jDemo.parserXml("/test.xml");
   }
}
