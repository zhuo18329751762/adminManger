package myZipStream;

import java.io.*;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        // 1 创建一个File表示要解压的压缩包
        File src=new File("E:\\a.zip");
        // 2 创建一个File表示解压的目的地
        File dest=new File("E:\\");
        //调用方法
        unzip(src,dest);
    }
    public static void unzip(File src,File dest) throws IOException {
        //创建一个解压缩流用来读取压缩包中的数据
        ZipInputStream zip=new ZipInputStream(new FileInputStream(src), Charset.forName("GBK"));
        ZipEntry entry;
        while ((entry=zip.getNextEntry())!=null){
            if(entry.isDirectory()){
                //文件夹:需要在目的地dest处创建一个同样的文件夹
                File file=new File(dest,entry.toString());
                file.mkdirs();//创建多级文件夹
            }else{
                //文件
                FileOutputStream fos=new FileOutputStream(new File(dest,entry.toString()));
                //读取文件内容
                int b;
                while ((b=zip.read())!=-1){
                    //写到目的地
                    fos.write(b);
                }
                fos.close();
                //表示在压缩包中的文件处理完毕
                zip.closeEntry();
            }
        }
        zip.close();
    }
}
