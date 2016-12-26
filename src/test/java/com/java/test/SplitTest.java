package com.java.test;

import java.net.URLDecoder;

/**
 * ${DESCRIPTION}
 *
 * @author riverxu
 * @create 2016-06-28-12:38.
 */
public class SplitTest {

    public static void main(String args[]) {
//        String picsrc = "https%3A%2F%2F10.url.cn%2Fqqcourse_logo_ng%2FajNVdqHZLLBKEWlFVwUTuzhjnlfNmQuT6jz0OYxWnWqwCtK7ca58dwMLXBjbvtUSsbG8BVYMoibw%2F220|https%3A%2F%2F10.url.cn%2Fqqcourse_logo_ng%2FajNVdqHZLLDTVBZPrfICBpHibUopdZTBC7gPWibdWTTWjDT1QO4kfWbPv09FTP6yS6TAehb1EWg1A%2F220|https%3A%2F%2F10.url.cn%2Fqqcourse_logo_ng%2FajNVdqHZLLACBcI0ic35Z00vsLZEgqvOicYfySjBd1UaBsZre1P0zqwbxB4XQqVvGibQtDkMzUq3Wo%2F220|https%3A%2F%2F10.url.cn%2Fqqcourse_logo_ng%2FajNVdqHZLLBsvZibdR1BwRYNSOZQIW4yfhjsfMmNkxXupwBibJ1faszkPHy30mfpDptraNr5JHTKM%2F220|https%3A%2F%2F10.url.cn%2Fqqcourse_logo_ng%2FajNVdqHZLLAq66sgUnz4YejUwxLaI0UBHmHY5nMGic3Hkqcy2ibOmI21q8kpeCZdcWPa4ibYW3X6WU%2F220|https%3A%2F%2F10.url.cn%2Fqqcourse_logo_ng%2FajNVdqHZLLAw3zGKkLDyuX1ULlCdDWXRdH8IHM6JvUL3Vrg4ywF2uyvBsdcY8rrxHdTFicel0lz8%2F220|https%3A%2F%2F10.url.cn%2Fqqcourse_logo_ng%2FajNVdqHZLLB6LmkJR8b7x1afjiaskTia6EpbFMnUFo7aicVfkWSBzuTHF9wAv65YAueJ4n6dthVovk%2F220|https%3A%2F%2F10.url.cn%2Fqqcourse_logo_ng%2FajNVdqHZLLDx3hicsia6YFm8FiabtibPyDoSY7fy8Xc2KYcR9v4C7zCQIg7ztDzttCIRdHianwRqAQUA%2F220|https%3A%2F%2F10.url.cn%2Fqqcourse_logo_ng%2FajNVdqHZLLCgCaiav4XJxcSaibvt57U53QPiathWBpbargibiciaNrjx1eE9BbmiagNayltuAYTDiaa0KHA%2F220|https%3A%2F%2F10.url.cn%2Fqqcourse_logo_ng%2FajNVdqHZLLAKCYo4UHypmAn044KJ4aXfUovI9iaE4icJdMdNbiaPqR0GPNlABUOaTHZ5FCTUCgkfiaY%2F220|https%3A%2F%2F10.url.cn%2Fqqcourse_logo_ng%2FajNVdqHZLLBU4UxmqAdVFnTOIyn3rFTqyJjLZ1jkiciaMmGFewEa7PTdQl37Nd5icT9YqVtj3HRBv4%2F220";

        String picsrc = "http%3A%2F%2F10.url.cn%2Fqqcourse_logo_ng%2FajNVdqHZLLAiaaVKdxEEa5YBGeoicP1G2EAes4hUniaZtXWhOBy1B1FbpWhCH5xu5ezIaxrXIlHXnY%2F";

        try {
            String pics = URLDecoder.decode(picsrc, "UTF-8");

            System.out.println("pics == " + pics);

            String[] picsList = pics.split("\\|");

            String result = picsList[0];

            for (String pic : picsList) {
                System.out.println(pic);
            }

            System.out.println("result ============ " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }




    }
}
