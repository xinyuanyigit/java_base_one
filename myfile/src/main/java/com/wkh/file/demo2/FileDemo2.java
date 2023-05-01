package com.wkh.file.demo2;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        File file = new File("D:\\flieTest");
        boolean flag = isExitFile(file);
        System.out.println(flag);
    }
    public static boolean isExitFile(File file){
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile() && f.getName().endsWith(".txt")){
                return true;
            }
        }
        return false;
    }
}
