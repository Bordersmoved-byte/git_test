package com.yz.xuliehua;

import java.io.*;
import java.util.ArrayList;

public class SerTest {
    public static void main(String[] args) throws Exception {

        //创建 学生对象
        StudentDemo01 s1 = new StudentDemo01("张三", "lanzhou");
        StudentDemo01 s2 = new StudentDemo01("李四", "xian");
        StudentDemo01 s3 = new StudentDemo01("王五", "beijing");


        ArrayList<StudentDemo01> demo01ArrayList = new ArrayList<>();
        demo01ArrayList.add(s1);
        demo01ArrayList.add(s2);
        demo01ArrayList.add(s3);

        //序列化
//        serialize(demo01ArrayList);

        //反序列化
        deserialize();


    }


    private static void serialize(ArrayList<StudentDemo01> demo01ArrayList) throws Exception {

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("list.txt"));

        objectOutputStream.writeObject(demo01ArrayList);

        objectOutputStream.close();

        System.out.println("success....");

    }


    private static void deserialize() throws IOException, ClassNotFoundException {

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("list.txt"));

        ArrayList<StudentDemo01> list = (ArrayList<StudentDemo01>) objectInputStream.readObject();

        for (int i = 0; i < list.size(); i++) {
            StudentDemo01 s = list.get(i);
            System.out.println(s.getName() + "------" + s.getPwd());
        }

    }

}
