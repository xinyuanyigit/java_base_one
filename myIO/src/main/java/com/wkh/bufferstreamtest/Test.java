package com.wkh.bufferstreamtest;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        //用字节流拷贝文件
        //创建文件对象
        long start = System.currentTimeMillis();
//        method1();//2532
//        method2();//16
//        method3();//0
        method4();//16
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    private static void method1() throws IOException {
        FileInputStream inputStream = new FileInputStream("D:\\flieTest\\b.txt");
        FileOutputStream outputStream = new FileOutputStream("D:\\flieTest\\one.txt");
        int b;
        while ((b = inputStream.read())!=-1){
            outputStream.write(b);
        }
        outputStream.close();
        inputStream.close();
    }
    private static void method2() throws IOException {
        FileInputStream inputStream = new FileInputStream("D:\\flieTest\\b.txt");
        FileOutputStream outputStream = new FileOutputStream("D:\\flieTest\\tow.txt");
        byte[] bytes = new byte[1024];
        int b;
        while ((b = inputStream.read(bytes))!=-1){
            outputStream.write(bytes);
        }
        outputStream.close();
        inputStream.close();
    }


    private static void method4() throws IOException {
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("D:\\flieTest\\b.txt"));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("D:\\flieTest\\four.txt"));

        int b;
        while ((b = inputStream.read())!=-1){
            outputStream.write(b);
        }
        outputStream.close();
        inputStream.close();
    }
    private static void method3() throws IOException {
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("D:\\flieTest\\b.txt"));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("D:\\flieTest\\three.txt"));
        byte[] bytes = new byte[1024];
        int b;
        while ((b = inputStream.read(bytes))!=-1){
            outputStream.write(bytes);
        }
        outputStream.close();
        inputStream.close();
    }
}
