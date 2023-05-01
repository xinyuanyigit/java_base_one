package com.wkh.demo2.mythread;

import com.wkh.demo2.pojo.MyThread1;

public class MyThreadDemo1 {
    public static void main(String[] args) {
       /* MyThread1 myThread2 = new MyThread1("tow_");
        MyThread1 myThread1 = new MyThread1("one_");
//        myThread1.setName("one_");
        myThread1.start();
        myThread2.start();*/
        Thread t1 = Thread.currentThread();
        String name = t1.getName();
        System.out.println(name);//main

    }
}
