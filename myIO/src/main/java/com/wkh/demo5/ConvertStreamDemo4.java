package com.wkh.demo5;

import java.io.*;

public class ConvertStreamDemo4 {
    public static void main(String[] args) throws IOException {
        //利用字节流读取文件中的数据，每次读一整行，不能乱码
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("myIO\\src\\main\\resources\\c.txt")));
        String line;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
