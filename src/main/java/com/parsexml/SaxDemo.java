package com.parsexml;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by riverxu on 2016/3/28.
 */
public class SaxDemo implements XmlDocument {

    public void parserXml(String fileName) {

        SAXParserFactory saxfac = SAXParserFactory.newInstance();

        try {
            SAXParser saxparser = saxfac.newSAXParser();
            saxparser.parse(SaxDemo.class.getResourceAsStream(fileName), new MySAXHandler());
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SaxDemo saxDemo = new SaxDemo();

        saxDemo.parserXml("/test.xml");
    }
}

class MySAXHandler extends DefaultHandler {

    public void startDocument() throws SAXException {
        System.out.println("文档开始打印了~~~~~~~~~~");
    }

    public void endDocument() throws SAXException {
        System.out.println("文档结束打印了~~~~~~~~~~");
    }

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("users")) {
//            return;
        }

        if (qName.equals("user")) {
//            return;
        }

        System.out.print(qName + ": ");

    }

    public void endElement(String uri, String localname, String qName) throws SAXException {
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.print(new String(ch, start, length));
    }
}
