package hdfs.demo;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HDFSApiDemo {
    // 可操作HDFS文件系统的对象
    static FileSystem hdfs = null;

    // 测试方法执行前执行，用于初始化操作，避免频繁初始化
    public static void init() throws IOException {
        // 构造一个配置参数对象，设置一个参数：要访问的HDFS的URI
        Configuration conf = new Configuration();
        // 指定使用HDFS访问
        conf.set("fs.defaultFS","hdfs://localhost:9000");//192.168.254.128改为你的ip地址
        // 进行客户端身份的设置(root为虚拟机的用户名，hadoop集群节点的其中一个都可以)
        System.setProperty("HADOOP_USER_NAME","root");
        // 通过FileSystem的静态get()方法获取HDFS文件系统客户端对象
        hdfs = FileSystem.get(conf);
    }

    // 测试方法执行后执行，用于处理结尾的操作，关闭对象
    public static void close() throws IOException {
        // 关闭文件操作对象
        hdfs.close();
    }
    public static void testUploadFileToHDFS(String mz,String cs) throws IOException {
        // 待上传的文件路径(windows)
        Path src = new Path("D:/HDFS/"+mz);
        // 上传之后存放的路径(HDFS)
        Path dst = new Path("/covid_data/"+cs+"/"+mz);
        // 上传
        hdfs.copyFromLocalFile(src,dst);
    }
    public static void testMkdirFile(String cs) throws IOException {
        // 待创建目录路径
        Path src = new Path("/covid_data/"+cs);
        // 创建目录
        hdfs.mkdirs(src);
    }

    public static void main(String[] args) throws IOException {
        init();
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        Queue<String> list = new LinkedList<String>();
        String[] mz = new String[714];
        for(int i=0;i<714;i++){
            String line = scan.next();
            mz[i]=line;
            String pattern = "(\\D*)(\\d+)(.*)";

            // 创建 Pattern 对象
            Pattern r = Pattern.compile(pattern);

            // 现在创建 matcher 对象
            Matcher m = r.matcher(line);
            String cs = "";
            if (m.find( )) {
                cs=m.group(1);
            } else {
                System.out.println(i+"NO MATCH");
            }
            if(list.contains(cs)) {
                continue;
            }
            list.add(cs);
        }
        int n = list.size();
        String[] cs = new String[n];
        for(int i=0;i<n;i++){
            cs[i]=list.poll();
        }
        for(int i=0;i<n;i++){//把文件放进文件夹
            testMkdirFile(cs[i]);//创建城市文件夹
            System.out.println(i+"创建成功");
            for(int j=0;j<21;j++){
                testUploadFileToHDFS(mz[i*21+j],cs[i]);
                System.out.println(i+"上传成功");
            }
        }
        scan.close();
        close();
    }
}
