package com.wkh.demo3.pojo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread2 extends Thread{
    public MyThread2() {
    }

    public MyThread2(String name) {
        super(name);
    }
    static int tickets = 0;
    static Object obj = new Object();
    //创建锁对象
    //锁对象必须唯一
    static Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            lock.lock();
            try {
                if (tickets < 100){
                    tickets++;
                    System.out.println(getName()+"正在卖"+tickets+"张票");
                        Thread.sleep(10);
                }else{
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }
    }
}
