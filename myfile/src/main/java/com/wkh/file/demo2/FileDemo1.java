package com.wkh.file.demo2;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        //在模块下创建a\b.txt
        File file = new File("myfile\\a");
        file.mkdirs();
        File src = new File(file, "b.txt");
        boolean flag = src.createNewFile();
        if (flag){
            System.out.println("创建成功");
        }else{
            System.out.println("创建失败");
        }
    }
}
