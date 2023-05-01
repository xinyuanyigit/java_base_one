package com.wkh.file.demo2;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        //找到电脑中所有的以txt结尾的文件
        File file = new File("D:\\");
//        find(file);
        findAll();
    }

    //获取本地所有的盘符
    public static void findAll(){
        File[] files = File.listRoots();
        for (File file : files) {
            find(file);
        }
    }

    private static void find(File file) {
        File[] files = file.listFiles();
        if (files != null){
            for (File file1 : files) {
                if (file1.isFile() && file1.getName().endsWith(".txt")){
                    System.out.println(file1);
                }else if (file1.isDirectory()){
                    find(file1);
                }
            }
        }
    }
}
