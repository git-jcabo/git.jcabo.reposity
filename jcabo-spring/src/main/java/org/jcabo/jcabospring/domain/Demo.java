package org.jcabo.jcabospring.domain;

public class Demo {
    private String aid;
    private String name;
    private String cid;

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "aid='" + aid + '\'' +
                ", name='" + name + '\'' +
                ", cid='" + cid + '\'' +
                '}';
    }
}
