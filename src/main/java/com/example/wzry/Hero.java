package com.example.wzry;

import java.io.Serializable;

public class Hero implements Serializable {

    /**
     * ename : 525
     * cname : 鲁班大师
     * title : 神匠
     * new_type : 0
     * hero_type : 6
     * skin_name : 神匠|归虚梦演
     */

    private Integer ename;
    private String cname;
    private String title;
    private Integer new_type;
    private Integer hero_type;
    private String skin_name;

    public Integer getEname() {
        return ename;
    }

    public void setEname(Integer ename) {
        this.ename = ename;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getNew_type() {
        return new_type;
    }

    public void setNew_type(Integer new_type) {
        this.new_type = new_type;
    }

    public Integer getHero_type() {
        return hero_type;
    }

    public void setHero_type(Integer hero_type) {
        this.hero_type = hero_type;
    }

    public String getSkin_name() {
        return skin_name;
    }

    public void setSkin_name(String skin_name) {
        this.skin_name = skin_name;
    }
}
