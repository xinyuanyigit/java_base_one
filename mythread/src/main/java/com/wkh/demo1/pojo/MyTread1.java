package com.wkh.demo1.pojo;

public class MyTread1 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"Hello World");
        }
    }
}
