package com.wkh.demo3.mythread;

import com.wkh.demo3.pojo.MyThread;
import com.wkh.demo3.pojo.MyThread2;

public class MyTheadDemo2 {
    public static void main(String[] args) {
        MyThread2 myThread1 = new MyThread2("01_");
        MyThread2 myThread2 = new MyThread2("02_");
        MyThread2 myThread3 = new MyThread2("03_");
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}
