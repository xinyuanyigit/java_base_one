package com.wkh.demo2.pojo;

public class MyThread2 implements Runnable{


    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName()+"_"+i);
        }
    }
}
