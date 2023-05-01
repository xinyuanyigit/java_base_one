package com.wkh.file.demo1;

import java.io.File;

public class FileDemo5 {
    public static void main(String[] args) {
        File f1 = new File("D:\\flieTest");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
