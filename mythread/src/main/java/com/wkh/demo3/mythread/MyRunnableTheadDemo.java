package com.wkh.demo3.mythread;

import com.wkh.demo3.pojo.MyRunableThread;

public class MyRunnableTheadDemo {
    public static void main(String[] args) {
        MyRunableThread rt = new MyRunableThread();
        Thread t1 = new Thread(rt);
        Thread t2 = new Thread(rt);
        Thread t3 = new Thread(rt);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
