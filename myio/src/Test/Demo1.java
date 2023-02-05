package Test;

import java.io.*;
import java.util.Date;

public class Demo1 {
    /*
    四种拷贝文件，并统计各自用时
    字节流的基本流：一次读写一个字节         用时29736毫秒
    字节流的基本流：一次读写一个字节数组      用时50毫秒
    字节缓冲流：一次读写一个字节            用时289毫秒
    字节缓冲流：一次读写一个字节数组         用时19毫秒
     */

    public static void main(String[] args) throws IOException {
//    1 字节流的基本流：一次读写一个字节
//        FileInputStream fis = new FileInputStream("E:\\测试\\测试视频.mp4");
//        FileOutputStream fos = new FileOutputStream("E:\\测试\\copy1.mp4");
//        int i;
//        long begin=System.currentTimeMillis();
//        while ((i=fis.read())!=-1){
//            fos.write(i);
//        }
//        long end=System.currentTimeMillis();
//        System.out.println("用时"+(end-begin)+"毫秒");//用时29736毫秒
//        fos.close();
//        fis.close();
//    2 字节流的基本流：一次读写一个字节数组
//        FileInputStream fis = new FileInputStream("E:\\测试\\测试视频.mp4");
//        FileOutputStream fos = new FileOutputStream("E:\\测试\\copy2.mp4");
//        int len;
//        byte[] arr=new byte[1024];
//        long begin = System.currentTimeMillis();
//        while ((len=fis.read(arr))!=-1){
//            fos.write(arr);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("用时"+(end-begin)+"毫秒");//用时50毫秒
//        fos.close();
//        fis.close();

//    3 字节缓冲流：一次读写一个字节
//        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("E:\\测试\\测试视频.mp4"));
//        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("E:\\测试\\copy3.mp4"));
//        int i;
//        long begin = System.currentTimeMillis();
//        while ((i=bis.read())!=-1){
//            bos.write(i);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("用时"+(end-begin)+"毫秒");//用时289毫秒
//        bos.close();
//        bis.close();

//    4 字节缓冲流：一次读写一个字节数组
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("E:\\测试\\测试视频.mp4"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("E:\\测试\\copy4.mp4"));
        int i;
        byte[] arr=new byte[1024];
        long begin = System.currentTimeMillis();
        while ((i=bis.read(arr))!=-1){
            bos.write(arr);
        }
        long end = System.currentTimeMillis();
        System.out.println("用时"+(end-begin)+"毫秒");//用时19毫秒
        bos.close();
        bis.close();

    }
}
