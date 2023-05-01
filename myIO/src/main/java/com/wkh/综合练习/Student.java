package com.wkh.综合练习;

public class Student {
    private String name;
    private String sex;
    private int age;
    private double weight;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Student() {
    }

    public Student(String name, String sex, int age, double weight) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
    }
}
