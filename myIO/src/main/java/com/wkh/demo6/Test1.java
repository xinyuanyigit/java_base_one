package com.wkh.demo6;

import java.io.*;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //创建对象
        Employ emp1 = new Employ("张三", 21);
        Employ emp2 = new Employ("李四", 22);
        Employ emp3 = new Employ("王五", 23);
        Employ emp4 = new Employ("赵六", 24);
        ArrayList<Employ> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        //序列化流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myIO\\src\\main\\resources\\c.txt"));
        oos.writeObject(list);
        oos.close();
    }
}
class Employ implements Serializable {
    private static final long serialVersionUID = 498163021647639816L;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Employ{" +
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

    public Employ() {
    }

    public Employ(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
