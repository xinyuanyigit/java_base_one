package com.wkh.myzipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //定义一个方法来解压
        //解压本质：把压缩包的每一个文件或文件夹读取出来，按照层级拷贝到目的地当中
        //创建一个数据源文件
        File src = new File("D:\\zip.zip");
        //创建一个目的地文件
        File dest = new File("D:\\");
        unzip(src,dest);

    }

    private static void unzip(File src, File dest) throws IOException {
        //创建一个压缩流用来读取压缩包中的数据
        ZipInputStream zip = new ZipInputStream(new FileInputStream("D:\\zip.zip"));
        //获取每一个压缩包中的entryzip对象
        ZipEntry entry;
        while ((entry = zip.getNextEntry())!=null){
            //判断entry是否是文件夹
            System.out.println(entry);
            if (entry.isDirectory()){
                //在目的地dest中创建一个同样的文件夹
                File file = new File(dest, entry.toString());
                file.mkdirs();
            }else{
                //是文件
                //把内存中的文件读取到对应的文件中
                FileOutputStream fos = new FileOutputStream(new File(dest, entry.toString()));
                int b;
                while ((b = zip.read())!=-1){
                    fos.write(b);
                }
                fos.close();
                zip.closeEntry();
            }
        }
        zip.close();
    }

}
