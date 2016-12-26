package com.parsexml.rich;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author riverxu
 * @create 2016-06-28-3:58.
 */
public class RichResult {
    private String type;

    private List<RichRoot> richRootList = new ArrayList<RichRoot>();

    public String getType() {
        return type;
    }

    public List<RichRoot> getRichRootList() {
        return richRootList;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRichRootList(List<RichRoot> richRootList) {
        this.richRootList = richRootList;
    }

    public void addRichRoot(RichRoot richRoot) {
        richRootList.add(richRoot);
    }
}
