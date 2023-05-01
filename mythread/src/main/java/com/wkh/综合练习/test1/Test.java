package com.wkh.综合练习.test1;

public class Test {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket();
        Thread t1 = new Thread(movieTicket);
        Thread t2 = new Thread(movieTicket);
        t2.setPriority(10);
        t1.setPriority(3);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t1.start();
        t2.start();
    }
}
