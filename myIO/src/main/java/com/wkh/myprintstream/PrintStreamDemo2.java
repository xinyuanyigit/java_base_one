package com.wkh.myprintstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PrintStreamDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        //创建字符打印流
        PrintWriter printWriter = new PrintWriter(new FileOutputStream("myIo\\src\\main\\resources\\g.txt"), true);
        printWriter.write(97);
        printWriter.println();
        printWriter.println("你好，世界");
        printWriter.print("hello world");
        printWriter.close();
    }
}
