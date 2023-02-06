 package myZipStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        /*
        压缩整个文件夹
         */
        // 1 创建File对象表示要压缩的文件
        File src=new File("E:\\测试");
        // 2 创建File对象表示压缩包位置
        File destParent=src.getParentFile();
        // 3 创建File对象表示压缩包的路径
        File dest=new File(destParent,src.getName()+".zip");
        // 4 创建压缩流并关联压缩包
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(dest));
        // 5 读取要压缩的文件(获取文件夹中的每一个文件,变成Zipentry对象，放入压缩包中)
        toZip(src,zos,src.getName());
        // 6 释放资源
        zos.close();
    }

    /*
    参数一：数据源
    参数二：压缩流
    参数三：压缩包中的内部路径
     */
    private static void toZip(File src,ZipOutputStream zos,String name) throws IOException {
        File[] files = src.listFiles();
        for (File file : files) {
            if(file.isFile()){
                //文件
                //创建zipentry对象
                ZipEntry entry=new ZipEntry(name+"\\"+file.getName());
                //把zipentry对象放入压缩包
                zos.putNextEntry(entry);
                //写入数据
                FileInputStream fis=new FileInputStream(file);
                int a;
                byte[] arr=new byte[1024];
                while ((a=fis.read(arr))!=-1){
                    zos.write(arr);
                }
                fis.close();
                zos.closeEntry();
            }else{
                //文件夹，递归
                toZip(file,zos,name+"\\"+file.getName());
            }
        }
    }
}
