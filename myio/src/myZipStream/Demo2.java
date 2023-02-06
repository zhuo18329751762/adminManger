package myZipStream;

import java.io.*;
import java.nio.charset.Charset;
import java.util.jar.JarEntry;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        /*
        压缩类
            把E:\\测试\\a.txt打包成一个压缩包
         */
        // 1 创建File对象表示要压缩的文件
        File src=new File("E:\\a.txt");
        // 2 创建File对象表示压缩包位置
        File dest=new File("E:\\");
        // 3 调用方法压缩
        toZip(src,dest);
    }
    //压缩，参数一：要压缩的文件 参数二：压缩包的位置
    public static void toZip(File src,File dest) throws IOException {
        // 1 创建压缩流关联压缩包
        ZipOutputStream zos=new ZipOutputStream(
                new FileOutputStream(new File(dest,"b.zip")));
        // 2 创建ZipEntry对象，表示压缩包里面的每一个文件和文件夹
        ZipEntry entry=new ZipEntry("b.txt");
        // 3 把ZipEntry对象放到压缩包当中
        zos.putNextEntry(entry);
        // 4 把src文件中的数据写到压缩包中
        FileInputStream fis=new FileInputStream(src);
        int b;
        while ((b=fis.read())!=-1){
            zos.write(b);
        }

        // 4 关流
        zos.closeEntry();
        zos.close();

    }
}
