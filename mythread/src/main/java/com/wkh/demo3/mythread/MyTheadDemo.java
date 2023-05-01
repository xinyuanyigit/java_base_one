package com.wkh.demo3.mythread;

import com.wkh.demo3.pojo.MyThread;

public class MyTheadDemo {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("01_");
        MyThread myThread2 = new MyThread("02_");
        MyThread myThread3 = new MyThread("03_");
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}
