package com.wkh.demo1.pojo;

import java.util.concurrent.Callable;

public class MyTread3 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum+=i;
        }
        System.out.println("结果是："+sum);
        return sum;
    }
}
