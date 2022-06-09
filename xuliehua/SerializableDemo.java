package com.yz.xuliehua;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableDemo {
    public static void main(String[] args) throws IOException {

        Employee employee = new Employee();
        employee.name = "zhangsan";
        employee.address = "chengguan";
//        employee.age = 20;

        //创建序列化流对象
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("employee.txt"));
        //写出对象
        objectOutputStream.writeObject(employee);
        //释放资源
        objectOutputStream.getClass();

        System.out.println("Serialized data is saved"); //姓名，地址被序列化，年龄没有被序列化

    }
}
