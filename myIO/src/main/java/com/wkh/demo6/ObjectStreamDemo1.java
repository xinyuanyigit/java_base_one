package com.wkh.demo6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //里哦用序列化流对象，把一个对象写入本地文件中

        //创建对象
        Student stu1 = new Student("张三", 20);
        //创建序列化流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myIO\\src\\main\\resources\\d.txt"));
        oos.writeObject(stu1);
        oos.close();
    }
}
class Student implements Serializable {
    private static final long serialVersionUID = 8872728237700108669L;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
