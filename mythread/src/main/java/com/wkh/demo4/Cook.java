package com.wkh.demo4;

public class Cook extends Thread{
    public Cook() {
    }

    public Cook(String name) {
        super(name);
    }



    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                if (Desk.count == 0){
                    break;
                }else if (Desk.foodFlag == 0){
                   //判断桌子上是否有食物
                    System.out.println("厨师正在做食物");
                    //修改桌子的状态
                    Desk.foodFlag = 1;
                    //叫醒消费者
                    Desk.lock.notifyAll();
                }else{
                    //判断桌子上有食物
                    try {
                        Desk.lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
