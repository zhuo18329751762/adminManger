package FileDemo;

import java.io.File;

public class Demo2 {
    public static void main(String[] args) {
        // 1 对一个文件路径进行判断
//        File f1=new File("E:\\测试\\a.txt");
//        System.out.println(f1.isDirectory());//false
//        System.out.println(f1.isFile());//true
//        System.out.println(f1.exists());//true
        // 2 对一个文件夹的路径进行判断
        File f2=new File("E:\\测试\\b");
        System.out.println(f2.isDirectory());//true
        System.out.println(f2.isFile());//false
        System.out.println(f2.exists());//true
        // 3 对一个不存在的路径进行判断
        File f3=new File("E:\\测试\\c.txt");
        System.out.println(f3.isDirectory());//false
        System.out.println(f3.isFile());//false
        System.out.println(f3.exists());//false
    }
}
