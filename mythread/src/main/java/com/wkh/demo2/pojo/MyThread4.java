package com.wkh.demo2.pojo;

public class MyThread4 extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getName()+i);
        }
    }

    public MyThread4() {
    }

    public MyThread4(String name) {
        super(name);
    }
}
