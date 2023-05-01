package com.wkh.file;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file = new File("D:\\qwe");
        boolean mkdirs = file.mkdirs();//创建了qwe这个文件夹
        System.out.println(mkdirs);
    }
}
