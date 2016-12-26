package com.parsexml.digester;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by riverxu on 2016/3/29.
 */
public class Parent {
    private String id;
    private List<Child> children = new ArrayList<Child>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public void addChild(Child child) {
        children.add(child);
    }
}
