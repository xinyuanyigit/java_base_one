package com.wkh.file.demo1;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        //根据文件路径创建文件对象
        String str = "C:\\Users\\86155\\Desktop\\a.txt";
        File file = new File(str);
        System.out.println(file);
        System.out.println("==================");
        //根据父路径字符串和子路径字符串创建文件对象
        String par = "C:\\Users\\86155\\Desktop";
        String zi = "a.txt";
        File file1 = new File(par, zi);
        System.out.println(file1);
        System.out.println("==================");
        //根据父路径对象和子路径字符串
        File parent = new File("C:\\Users\\86155\\Desktop");
        String second = "a.txt";
        File file2 = new File(parent, second);
        System.out.println(file2);
    }
}
