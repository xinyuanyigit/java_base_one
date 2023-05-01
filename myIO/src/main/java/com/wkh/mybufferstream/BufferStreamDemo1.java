package com.wkh.mybufferstream;

import java.io.*;

public class BufferStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //利用字节缓冲流拷贝文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myIO\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myIO\\d.txt"));
        int len;//一次读写一个字节
        while ((len = bis.read())!=-1){
            bos.write(len);
        }
        bos.close();
        bis.close();
    }
}
