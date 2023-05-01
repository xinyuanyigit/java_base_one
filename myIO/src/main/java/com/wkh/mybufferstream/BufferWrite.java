package com.wkh.mybufferstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWrite {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输出流
        BufferedWriter writer = new BufferedWriter(new FileWriter("myIO\\c.ttx"));
        String str = "无敌，好吧";
        writer.write(str);
        writer.newLine();
        String str2 = "行，你可以";
        writer.write(str2);
        writer.close();
    }
}
