package com.wkh.mybufferstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
    public static void main(String[] args) throws IOException {
        //创建 字符缓冲输入流对象
        BufferedReader reader = new BufferedReader(new FileReader("myIO\\a.txt"));
        String str;
        //读一行
        while ((str = reader.readLine())!=null){
            System.out.println(str);
        }
        reader.close();
    }
}
