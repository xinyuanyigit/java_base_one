package com.wkh.file.demo2;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        File file = new File("D:\\flieTest\\e");
        delete(file);
    }
    public static void delete(File file){
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()){
                file1.delete();
            }else if (file1.isDirectory()){
                delete(file1);
            }
        }
        file.delete();
    }
}
