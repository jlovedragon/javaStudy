package com.java.test;

/**
 * ${DESCRIPTION}
 *
 * @author riverxu
 * @create 2016-06-28-6:55.
 */
public class StringTest {


    private static final String FROM = "from=qqchat";

    public static void main(String args[]) {


        String url1 = "https://ke.qq.com/course/114744#term_id=100132297";
        String url2 = "https://ke.qq.com/huodong/summerdesign/index.html";
        String url3 = "https://ke.qq.com/user/tasks/index.html?cid=123289#tid=100135909&fr=2";


        url1 = dealURL(url1);
        url2 = dealURL(url2);
        url3 = dealURL(url3);


        System.out.println("url1 ==== " + url1);
        System.out.println("url2 ==== " + url2);
        System.out.println("url3 ==== " + url3);



        // 判断url是来自任务、详情页还是其他
        String openText1 = urlComeFrom(url1);
        String openText2 = urlComeFrom(url2);
        String openText3 = urlComeFrom(url3);


        System.out.println("openText1 ==== " + openText1);
        System.out.println("openText2 ==== " + openText2);
        System.out.println("openText3 ==== " + openText3);


    }

    public static String dealURL(String url) {

        String changeUrl = null;

        int slashIndex = url.lastIndexOf("/");

        String last = url.substring(slashIndex+1);

        int questionIndex = last.indexOf("?");

        if (questionIndex != -1) {
            changeUrl = url.substring(0, slashIndex + 1) + last.substring(0, questionIndex+1) + FROM + "&" + last.substring(questionIndex+1);


        } else {
            int signIndex = url.indexOf("#");

            if (signIndex != -1) {

                changeUrl = url.substring(0, signIndex) + "?" + FROM + url.substring(signIndex);

            } else {
                changeUrl = url + "?" + FROM;
            }
        }

        System.out.println("last === " + last);

        System.out.println("changeUrl === " + changeUrl);

        return changeUrl;
    }

    public static String urlComeFrom(String url) {
        if (url.contains("ke.qq.com/course/") || url.contains("ke.qq.com/user/tasks")) {
            return "立即进入";
        } else  {
            return "open";
        }
    }

}
