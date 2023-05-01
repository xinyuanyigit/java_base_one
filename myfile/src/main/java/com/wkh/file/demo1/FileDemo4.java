package com.wkh.file.demo1;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
        //只能创建文件
        File f1 = new File("D:\\flieTest\\b.txt");
        System.out.println(f1.createNewFile());
        File f2 = new File("D:\\flieTest\\c");
        System.out.println(f2.createNewFile());
        System.out.println("=============");
        //创建文件夹,只能创建单级目录
        File f3 = new File("D:\\flieTest\\d");
        System.out.println(f3.mkdir());
        System.out.println("=============");
        File f4 = new File("D:\\flieTest\\e\\f\\g");
        System.out.println(f4.mkdirs());
        System.out.println("=============");
        //删除文件或文件夹，不经过回收站,只能删除空的文件夹
        File f5 = new File("D:\\flieTest\\a.txt");
        System.out.println(f5.delete());
        System.out.println("=============");
    }
}
