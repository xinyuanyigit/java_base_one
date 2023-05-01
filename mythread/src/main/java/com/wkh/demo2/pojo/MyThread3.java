package com.wkh.demo2.pojo;

public class MyThread3 extends Thread{
    public MyThread3() {
    }

    public MyThread3(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName()+i);
        }
    }
}
