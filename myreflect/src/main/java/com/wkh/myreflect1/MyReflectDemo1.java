package com.wkh.myreflect1;

public class MyReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        /**
         * 获取class对象的三种方式
         * 1.Class.forName("全类名")
         * 2.类名.class
         * 3.对象.getClass()
         */
        //1.Class.forName("全类名")
        Class clazz1 = Class.forName("com.wkh.myreflect1.Student");

        //2.类名.class
        Class clazz2 = Student.class;

        //3.对象.getClass()
        Class clazz3 = new Student().getClass();

        System.out.println(clazz1 == clazz2);
        System.out.println(clazz2 == clazz3);
    }
}
