package com.wkh.bufferstreamtest;

import com.wkh.mybufferstream.BufferReader;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //把count.txt文件读到内存中
        BufferedReader reader = new BufferedReader(new FileReader("myIO\\src\\main\\resources\\count.txt"));
        String line = reader.readLine();
        int count = Integer.parseInt(line);
        count = count+1;
        reader.close();
        if (count <=3){
            System.out.println("第"+count+"次使用本软件");
        }else{
            System.out.println("第"+count+"使用，需要收费");
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("myIO\\src\\main\\resources\\count.txt"));

        writer.write(count+"");
        writer.close();
    }
}
