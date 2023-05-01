package com.wkh.综合练习.test3;

public class Print2 implements Runnable{

    private int n = 1;
    @Override
    public void run() {
        while (true){
            synchronized (Print2.class){
                if (n>100){
                    break;
                }else{
                    if (n%2 != 0){
                        System.out.println(Thread.currentThread().getName()+"-"+n);
                    }
                    n++;
                }

            }
        }
    }
}
