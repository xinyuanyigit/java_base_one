package com.wkh.mytreemap;

import java.util.Objects;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class A02_TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Student,String> treeMap = new TreeMap<>();
        Student stu1 = new Student("zhangsan",21);
        Student stu2 = new Student("lisi",23);
        Student stu3 = new Student("wangwu",22);
        Student stu4 = new Student("zs",21);
        Student stu5 = new Student("zs",21);
        treeMap.put(stu1,"A");
        treeMap.put(stu2,"B");
        treeMap.put(stu3,"C");
        treeMap.put(stu4,"D");
        treeMap.put(stu5,"e");
        treeMap.forEach(new BiConsumer<Student, String>() {
            @Override
            public void accept(Student key, String value) {
                System.out.println(key+"="+value);
            }
        });
    }
}
class Student implements Comparable<Student> {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Student o) {
        int i = this.getAge() - o.getAge();
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;
        return i;
    }
}
