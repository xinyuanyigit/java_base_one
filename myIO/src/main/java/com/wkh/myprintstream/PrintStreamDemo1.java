package com.wkh.myprintstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class PrintStreamDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        //创建字节打印流
        PrintStream printStream = new PrintStream(new FileOutputStream("myIO\\src\\main\\resources\\g.txt"), true, Charset.forName("UTF-8"));
        printStream.println("hello world");
        printStream.print("你好，世界");
        printStream.println();
        printStream.print(true);
        printStream.println();
        printStream.print(97);
        printStream.close();
    }
}
