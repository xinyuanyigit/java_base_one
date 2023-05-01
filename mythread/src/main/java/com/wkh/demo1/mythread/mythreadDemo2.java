package com.wkh.demo1.mythread;

import com.wkh.demo1.pojo.MyTread2;

public class mythreadDemo2 {
    public static void main(String[] args) {
        //创建自己的类的对象
        MyTread2 myTread1 = new MyTread2();
        //创建Thread类的对象
        Thread t1 = new Thread(myTread1);
        Thread t2 = new Thread(myTread1);
        t1.setName("one_");
        t2.setName("tow_");
        t1.start();
        t2.start();
    }
}
