package com.yz.xuliehua;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {



        //创建反序列化流
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("employee.txt"));
        //读取一个对象
        Employee employee = (Employee) objectInputStream.readObject();
        //释放资源
        objectInputStream.close();

        System.out.println("Name : " + employee.name);
        System.out.println("Address : " + employee.address);
//        System.out.println("Age : " + employee.age);


    }
}
