package com.wkh.mybufferstream;

import java.io.*;

public class BufferStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //利用字节缓冲流拷贝文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myIO\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myIO\\d2.txt"));
        int len;//一次读写多个字节
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
    }
    }

