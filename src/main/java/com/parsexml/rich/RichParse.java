package com.parsexml.rich;

import org.apache.commons.digester.Digester;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLDecoder;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author riverxu
 * @create 2016-06-28-4:54.
 */
public class RichParse {


    public static void main(String[] args) {
        String result = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<qzone>\n" +
                "    <result type=\"0\">\n" +
                "        <root>\n" +
                "            <pics>http%3A%2F%2F10.url.cn%2Fqqcourse_logo_ng%2FajNVdqHZLLDcnHtUb03rWujd5ak1We0UN1ZmG9wEuGszNK1o1jJdxiaCxo99wADdk4BabV5LNYKc%2F</pics>\n" +
                "            <site />\n" +
                "            <summary>零基础淘宝运营全方位实操、问题答疑，教你从入门到精英！</summary>\n" +
                "            <title>2016淘宝运营实操从入门到精通(意想不到的收获)【驿路电商学院】</title>\n" +
                "            <type>4</type>\n" +
                "        </root>\n" +
                "    </result>\n" +
                "</qzone>";

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL url = classLoader.getResource("rich.xml");

        try {
            InputStream is = new ByteArrayInputStream(result.getBytes());

            parseXml(is);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    private static void parseXml(InputStream result) {

        Digester digester = new Digester();
        digester.setValidating(false);

        digester.addObjectCreate("qzone/result", RichResult.class);
        digester.addSetProperties("qzone/result");

        digester.addObjectCreate("qzone/result/root", RichRoot.class);
        digester.addBeanPropertySetter("qzone/result/root/pics", "pics");
        digester.addBeanPropertySetter("qzone/result/root/site", "site");
        digester.addBeanPropertySetter("qzone/result/root/summary", "summary");
        digester.addBeanPropertySetter("qzone/result/root/title", "title");
        digester.addBeanPropertySetter("qzone/result/root/type", "type");
        digester.addSetNext("qzone/result/root", "addRichRoot");

        try {
            RichResult richResult = (RichResult) digester.parse(result);

            System.out.println("result id :" + richResult.getType());
//
//            RichRoot richRoot = richResult.getRichRoot();

//            System.out.println(richRoot.toString());

            List<RichRoot> richRootList = richResult.getRichRootList();

            for (RichRoot richRoot : richRootList) {

                System.out.println("root-pics: " + richRoot.getPics());


                String srcPics = URLDecoder.decode(richRoot.getPics(), "UTF-8");
                System.out.println("root-srcPics: " + srcPics);

                System.out.println("root-summary: " + richRoot.getSummary());
                System.out.println("root-title: " + richRoot.getTitle());
            }

//            for (RichResult richResult : qzone) {
//                System.out.println("result id :" + richResult.getType());
//
//                RichRoot richRoot = richResult.getRichRoot();
//
//                System.out.println(richRoot.toString());
//
//                System.out.println("root-pics: " + richRoot.getPics());
//                System.out.println("root-summary: " + richRoot.getSummary());
//                System.out.println("root-title: " + richRoot.getTitle());
//
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
