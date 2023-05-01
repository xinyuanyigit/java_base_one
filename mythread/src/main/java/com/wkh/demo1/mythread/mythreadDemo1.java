package com.wkh.demo1.mythread;

import com.wkh.demo1.pojo.MyTread1;

public class mythreadDemo1 {
    public static void main(String[] args) {
        MyTread1 mt1 = new MyTread1();
        MyTread1 mt2 = new MyTread1();
        mt1.setName("第一个");
        mt2.setName("第二个");
        mt1.start();
        mt2.start();
    }
}
