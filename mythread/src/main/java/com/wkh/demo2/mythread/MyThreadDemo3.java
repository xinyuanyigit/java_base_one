package com.wkh.demo2.mythread;

import com.wkh.demo2.pojo.MyThread3;
import com.wkh.demo2.pojo.MyThread3x;

public class MyThreadDemo3 {
    public static void main(String[] args) {
        MyThread3 thread3 =new MyThread3("one_");
        MyThread3x thread3x =new MyThread3x("tow_");
        thread3x.setDaemon(true);
        thread3.start();
        thread3x.start();
    }
}
