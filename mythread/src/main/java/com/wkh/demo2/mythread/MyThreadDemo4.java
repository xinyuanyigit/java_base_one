package com.wkh.demo2.mythread;

import com.wkh.demo2.pojo.MyThread4;

public class MyThreadDemo4 {
    public static void main(String[] args) throws InterruptedException {
        MyThread4 thread1 = new MyThread4("_one");
        thread1.start();
        thread1.join();
        for (int i = 1; i <= 10; i++) {
            System.out.println("main_"+i);
        }
    }
}
