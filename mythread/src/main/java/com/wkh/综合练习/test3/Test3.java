package com.wkh.综合练习.test3;

public class Test3 {
    public static void main(String[] args) {
        /*Print p1 = new Print("线程1");
        Print p2 = new Print("线程2");
        p1.start();
        p2.start();*/
        Print2 p1 = new Print2();
        Thread t1 = new Thread(p1,"线程1");
        Thread t2 = new Thread(p1,"线程2");
        t1.start();
        t2.start();
    }
}
