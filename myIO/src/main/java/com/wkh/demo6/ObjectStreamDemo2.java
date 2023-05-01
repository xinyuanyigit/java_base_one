package com.wkh.demo6;

import java.io.*;

public class ObjectStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //反序列化流
        ObjectInputStream oos = new ObjectInputStream(new FileInputStream("myIO\\src\\main\\resources\\d.txt"));
        Student stu1 = (Student) oos.readObject();
        oos.close();
        System.out.println(stu1);
    }
}
