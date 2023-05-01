package com.wkh.file.demo1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo3 {
    public static void main(String[] args) {
        //返回文件的大小，字节数量,只能返回文件的大小，不能返回文件夹的大小
        File f1 = new File("D:\\flieTest\\a.txt");
        System.out.println(f1.length());
        System.out.println("==============");
        //获取文件的的绝对路径
        File f2 = new File("D:\\flieTest\\a.txt");
        System.out.println(f2.getAbsolutePath());//D:\flieTest\a.txt
        File f3 = new File("myfile\\c.txt");
        System.out.println(f3.getAbsolutePath());//D:\java学习\java基础2\myfile\c.txt
        System.out.println("================");
        //返回定义文件时使用的路径
        File f4 = new File("myfile\\c.txt");//这里定义什么，就返回什么
        System.out.println(f4.getPath());//myfile\c.txt
        System.out.println("================");
        //返回文件名字，带后缀
        File f5 = new File("myfile\\c.txt");//这里定义什么，就返回什么
        System.out.println(f5.getName());//myfile\c.txt
        System.out.println("================");
        //返回最后修改文件的时间
        File f6 = new File("D:\\flieTest\\a.txt");//这里定义什么，就返回什么
        System.out.println(f6.lastModified());//myfile\c.txt
        Date date = new Date(f6.lastModified());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH : mm : ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        System.out.println("================");
    }
}
