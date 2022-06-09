package com.yz.xuliehua;

import java.io.Serializable;

public class Employee implements Serializable {

    //加入序列版本号
    private static final long serialVersionUID = 1L;
    public String name;
    public String address;
    //public transient int age;   //此处不会被序列化
    public int eid;

    public void addressCheck() {
        System.out.println("Address check : " + name + "--" + address);
    }




}
