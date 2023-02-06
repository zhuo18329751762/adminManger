package mycommonsIO;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        /*
        FileUtils类
            static void copyFile(File srcFile,File destFile)        复制文件
            static void copyDirectory(File srcDir,File destDir)     复制文件夹


         */
        //复制文件
//        File src=new File("myio\\a.txt");
//        File dest=new File("myio\\e.txt");
//        FileUtils.copyFile(src,dest);

        //复制文件夹
//        File src=new File("E:\\测试\\f");
//        File dest=new File("E:\\测试\\w");
//        FileUtils.copyDirectory(src,dest);
//        FileUtils.copyDirectoryToDirectory(src,dest);//整体复制，并创建一个新的文件夹保存

        //删除文件夹
//        File dest=new File("E:\\测试\\f");
//        FileUtils.deleteDirectory(dest);

        //清空文件夹内容
        File dest=new File("E:\\测试\\w");
        FileUtils.cleanDirectory(dest);


    }
}
