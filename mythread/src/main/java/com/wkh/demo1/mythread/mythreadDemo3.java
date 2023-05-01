package com.wkh.demo1.mythread;

import com.wkh.demo1.pojo.MyTread3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class mythreadDemo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建自己的类的对象
        MyTread3 myTread = new MyTread3();
        //创建FutureTask对象：管理线程任务
        FutureTask<Integer> task = new FutureTask<>(myTread);
        //创建线程对象
        Thread t1 = new Thread(task);
        t1.start();
        Integer num = task.get();
        System.out.println(num);

    }
}
