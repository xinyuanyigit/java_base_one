package com.wkh.exception.demo1;

public class Friend {
    private String name;
    private int age;

    public Friend() {
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int length = name.length();
        if (length == 0){
            throw new NameFormatException("姓名格式出错");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<18 || age >50){
            throw new AgeOutOfBoundsException("年龄转黄出错");
        }
        this.age = age;
    }

    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
