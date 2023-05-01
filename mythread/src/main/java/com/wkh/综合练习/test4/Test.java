package com.wkh.综合练习.test4;



public class Test {
    public static void main(String[] args) {
        MyThread t2 = new MyThread("02");
        t2.setPriority(10);
        MyThread t3 = new MyThread("03");
        MyThread t4 = new MyThread("04");
        MyThread t5 = new MyThread("05");
        MyThread t1 = new MyThread("01");
        t1.setPriority(1);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
