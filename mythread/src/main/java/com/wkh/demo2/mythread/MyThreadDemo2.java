package com.wkh.demo2.mythread;

import com.wkh.demo2.pojo.MyThread2;

public class MyThreadDemo2 {
    public static void main(String[] args) {
        MyThread2 thread1 = new MyThread2();
        Thread t1 = new Thread(thread1,"one");
        Thread t2 = new Thread(thread1,"two");
        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        t2.start();
    }
}
