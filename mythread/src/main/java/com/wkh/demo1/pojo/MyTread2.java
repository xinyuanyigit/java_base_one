package com.wkh.demo1.pojo;

public class MyTread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            /*Thread t = new Thread();
            System.out.println(t.getName()+"hello,world");*/
            //Thread.currentThread():谁调用这个方法，就返回这个对象
            System.out.println(Thread.currentThread().getName()+"hello,world");
        }
    }
}
