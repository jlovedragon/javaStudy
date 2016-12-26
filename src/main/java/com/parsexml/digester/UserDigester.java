package com.parsexml.digester;

import org.apache.commons.digester.Digester;

import java.util.List;

/**
 * Created by riverxu on 2016/3/29.
 */
public class UserDigester {

    public static void main(String[] args) throws Exception {
        Digester digester = new Digester();
        digester.setValidating(false);
        digester.addObjectCreate("users", Users.class);
        digester.addObjectCreate("users/user", User.class);

        digester.addBeanPropertySetter("users/user/name", "name");
        digester.addBeanPropertySetter("users/user/age", "age");
        digester.addBeanPropertySetter("users/user/sex", "sex");

        digester.addSetNext("users/user", "addUser");

        Users users = null;

        try {
            users = (Users)digester.parse(UserDigester.class.getResourceAsStream("/test.xml"));

            List<User> userList = users.getUserList();

            for (int i = 0; i < userList.size(); i++) {
                User user = (User) userList.get(i);
                System.out.println(user.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
