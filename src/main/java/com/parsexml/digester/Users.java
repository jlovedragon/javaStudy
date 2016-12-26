package com.parsexml.digester;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by riverxu on 2016/3/29.
 */
public class Users {

    private List userList = new ArrayList();

    public List getUserList() {
        return userList;
    }

    public void setUserList(List userList) {
        this.userList = userList;
    }

    public void addUser(User user) {
        this.userList.add(user);
    }
}
