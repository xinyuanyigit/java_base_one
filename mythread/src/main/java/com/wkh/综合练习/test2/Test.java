package com.wkh.综合练习.test2;

public class Test {
    public static void main(String[] args) {
        SendGift sendGift = new SendGift();
        Thread t1 = new Thread(sendGift,"窗口1");
        Thread t2 = new Thread(sendGift,"窗口2");
        t1.start();
        t2.start();
    }
}
