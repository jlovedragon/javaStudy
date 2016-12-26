package com.parsexml.rich;

/**
 * ${DESCRIPTION}
 *
 * @author riverxu
 * @create 2016-06-28-3:51.
 */
public class RichRoot {
    private String pics;
    private String summary;
    private String title;
    private String site;
    private int type;

    public String getPics() {
        return pics;
    }

    public String getSummary() {
        return summary;
    }

    public String getTitle() {
        return title;
    }

    public void setPics(String pics) {
        this.pics = pics;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSite() {
        return site;
    }

    public int getType() {
        return type;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "RichRoot{" +
                "pics='" + pics + '\'' +
                ", summary='" + summary + '\'' +
                ", title='" + title + '\'' +
                ", site='" + site + '\'' +
                ", type=" + type +
                '}';
    }
}
