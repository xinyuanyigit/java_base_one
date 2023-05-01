package com.wkh.demo3.pojo;

public class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }
    static int tickets = 0;
    static Object obj = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if (tickets < 100){
                    tickets++;
                    System.out.println(getName()+"正在卖"+tickets+"张票");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }
            }

        }
    }
}
