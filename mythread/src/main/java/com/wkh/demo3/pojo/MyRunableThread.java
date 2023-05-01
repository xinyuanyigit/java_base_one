package com.wkh.demo3.pojo;

public class MyRunableThread implements Runnable {
    private int tickets = 0;

    @Override
    public void run() {
        while (true) {
            if (method()) break;
        }
    }

    private synchronized boolean method() {
        if (tickets == 100) {
            return true;
        } else {
            tickets++;
            System.out.println(Thread.currentThread().getName() + "正在卖" + tickets + "张票");
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }
}
