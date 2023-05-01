package com.wkh.myreflect2;

public class Student {
    private String name;
    private int age;
    private char gender;
    private int height;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", height=" + height +
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Student() {
    }

    public Student(String name, int age, char gender, int height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }
}
