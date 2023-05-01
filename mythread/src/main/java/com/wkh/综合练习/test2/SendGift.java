package com.wkh.综合练习.test2;

public class SendGift implements Runnable{
    //一共有的总份数
    private int giftCount = 100;
    //卖出的份数
    private int count = 0;
    //定义锁对象
    private Object obj = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if (giftCount<=10){
                    break;
                }else{
                    giftCount--;
                    count++;
                    System.out.println(Thread.currentThread().getName()+"卖出了"+count+"份礼品,还剩"+giftCount+"份礼品");
                }
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
