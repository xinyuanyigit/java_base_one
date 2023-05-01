package com.wkh.demo4;

public class MyThreadDemo1 {
    public static void main(String[] args) {
        //开启线程
        Cook cook = new Cook("厨师");
        Foodie foodie = new Foodie("吃货");
        cook.start();
        foodie.start();
    }
}
