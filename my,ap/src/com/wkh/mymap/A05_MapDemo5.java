package com.wkh.mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiConsumer;

public class A05_MapDemo5 {
    public static void main(String[] args) {
        Student stu1 = new Student("zhangsan",12,"nan");
        Student stu2 = new Student("zhangsa",13,"nan");
        Student stu3 = new Student("zhangsn",14,"nv");
        Student stu4 = new Student("zhangsan",12,"nan");
        Map<Student,Integer> map = new HashMap<>();
        map.put(stu1,1);
        map.put(stu2,2);
        map.put(stu3,3);
        map.put(stu4,4);
        Set<Student> keySet = map.keySet();
        for (Student key : keySet) {
            System.out.println(key+"="+map.get(key));
        }
        System.out.println("====================");
        Set<Map.Entry<Student, Integer>> entries = map.entrySet();
        for (Map.Entry<Student, Integer> entry : entries) {
            Student key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }
        System.out.println("=================");
        map.forEach(new BiConsumer<Student, Integer>() {
            @Override
            public void accept(Student key, Integer value) {
                System.out.println(key+"="+value);
            }
        });
    }
}
class Student
{
    private String name;
    private Integer age;
    private String sex;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(age, student.age) &&
                Objects.equals(sex, student.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}