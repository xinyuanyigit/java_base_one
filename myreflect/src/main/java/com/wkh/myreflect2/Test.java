package com.wkh.myreflect2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        Student student = new Student("yuner", 23, '女', 168);
        Teacher teacher = new Teacher("zhang", 22);
        saveObject(student);
    }

    private static void saveObject(Object obj) throws IOException, IllegalAccessException {
        Class<?> clazz = obj.getClass();
        BufferedWriter bw = new BufferedWriter(new FileWriter("myreflect\\src\\main\\resources\\a.txt"));
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String name = field.getName();
            Object value = field.get(obj);
            bw.write(name+"="+value);
            bw.newLine();
        }
        bw.close();
    }
}
