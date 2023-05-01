package hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class a {
    // 可操作HDFS文件系统的对象
    FileSystem hdfs = null;

    // 测试方法执行前执行，用于初始化操作，避免频繁初始化
    @Before
    public void init() throws IOException {
        // 构造一个配置参数对象，设置一个参数：要访问的HDFS的URI
        Configuration conf = new Configuration();
        // 指定使用HDFS访问
        conf.set("fs.defaultFS","hdfs://localhost:9000");
        // 进行客户端身份的设置(root为虚拟机的用户名，hadoop集群节点的其中一个都可以)
        System.setProperty("HADOOP_USER_NAME","root");
        // 通过FileSystem的静态get()方法获取HDFS文件系统客户端对象
        hdfs = FileSystem.get(conf);
    }

    // 测试方法执行后执行，用于处理结尾的操作，关闭对象
    @After
    public void close() throws IOException {
        // 关闭文件操作对象
        hdfs.close();
    }
    @Test
    public void testUploadFileToHDFS() throws IOException {
        // 待上传的文件路径(windows)
        Path src = new Path("D:/HDFS/test2.txt");
        // 上传之后存放的路径(HDFS)
        Path dst = new Path("/test3.txt");
        // 上传
        hdfs.copyFromLocalFile(src,dst);
        System.out.println("上传成功");
    }
}
