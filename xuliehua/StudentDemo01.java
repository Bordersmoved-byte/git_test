package com.yz.xuliehua;

import java.io.Serializable;

public class StudentDemo01 implements Serializable {

    private String name;
    private String pwd;

    public StudentDemo01(final String name, final String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getPwd() {
        return this.pwd;
    }

    public void setPwd(final String pwd) {
        this.pwd = pwd;
    }
}
