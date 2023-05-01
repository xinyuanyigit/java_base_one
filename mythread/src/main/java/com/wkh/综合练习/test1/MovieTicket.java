package com.wkh.综合练习.test1;

public class MovieTicket implements Runnable{
    private Object obj = new Object();
    private int ticket = 1000;
    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if (ticket == 0){
                    System.out.println(Thread.currentThread().getName()+"没有票了");
                    break;
                }else{
                    //取票
                    ticket--;
                    System.out.println(Thread.currentThread().getName()+"还剩"+ticket+"张票");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
