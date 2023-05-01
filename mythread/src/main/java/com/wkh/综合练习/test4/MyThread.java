package com.wkh.综合练习.test4;

import java.util.Random;



public class MyThread extends Thread{
    static double money = 100;
    static int count = 3;
    static final double Min = 0.01;


    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        synchronized (MyThread.class){
            if (count == 0){
                System.out.println(getName()+"没有抢到红包");
            }else {
                double price = 0;
                if (count == 1){
                    price = money;
                }else{
                    //设置范围
                    /*double bounds = money - (count-1)*Min;
                    Random r = new Random();
                    price = r.nextDouble();*/
                    price = Math.random() * 100-Min*(count-1);
                    if (price<Min){
                        price = Min;
                    }
                }
                money = money - price;
                count = count-1;
                System.out.println(getName()+"抽中了"+price+"元");
//                printf(getName()+"抽中了"+"%.2f"+"元",price);
            }
        }
    }
}
