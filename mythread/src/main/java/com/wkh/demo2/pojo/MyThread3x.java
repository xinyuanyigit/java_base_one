package com.wkh.demo2.pojo;

public class MyThread3x extends Thread{
    public MyThread3x() {
    }

    public MyThread3x(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getName()+i);
        }
    }
}
