package com.wkh.file.demo2;

import java.io.File;

public class FileDemo5 {
    public static void main(String[] args) {
        File file = new File("D:\\flieTest");
        long len = getLen(file);
        System.out.println(len);
    }

    private static long getLen(File src) {
        long len = 0;
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()){
                len+=file.length();
            }else if (file.isDirectory()){
                len+=getLen(file);
            }
        }
        return len;
    }
}
