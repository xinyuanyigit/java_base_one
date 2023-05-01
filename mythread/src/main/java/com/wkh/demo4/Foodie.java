package com.wkh.demo4;

public class Foodie extends Thread{
    public Foodie() {
    }

    public Foodie(String name) {
        super(name);
    }
    //消费者

    /**
     * 1.循环
     * 2.同步代码块（同步方法）
     * 3.判断数据是否到达末尾（到了末尾）
     * 4.判断数据是否到达末尾（没到了末尾，核心逻辑）
     */
    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                if (Desk.count == 0){
                    break;
                }else{
                    //桌子上没有
                    if (Desk.foodFlag == 0){
                        //等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        //桌子上有
                        Desk.count--;
                        System.out.println("吃货还能吃"+Desk.count+"碗");
                        //吃完之后唤醒厨师
                        Desk.lock.notifyAll();
                        //改变桌子状态
                        Desk.foodFlag = 0;
                    }
                }
            }
        }
    }
}
