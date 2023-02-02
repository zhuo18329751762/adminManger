package FileDemo;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo3 {
    public static void main(String[] args) throws ParseException {

        // 1 length 返回文件的大小(字节数量)
        File f1 = new File("E:\\测试\\a.txt");
        long len1 = f1.length();
        System.out.println(len1);

        //lenth 只能获取文件的大小，单位是字节
        //如果单位是M，G，可以不断的除以1024
        //len/1024 kb
        //len/1024/1024 mb
        //len/1024/1024/1024 gb
        File f2=new File("E:\\测试\\b");
        long l2 = f2.length();
        System.out.println(l2);
        System.out.println("----------------------------");

        // 2 getAbsolutePath 返回文件的绝对路径
        File f3=new File("E:\\测试\\a.txt");
        String path1 = f3.getAbsolutePath();
        System.out.println(path1);

        File f4=new File("myFile\\a.txt");
        String path2=f4.getAbsolutePath();
        System.out.println(path2);
        System.out.println("----------------------------");

        // 3 getPath 返回定义文件时使用的路径
        File f5=new File("E:\\测试\\a.txt");
        String path3 = f5.getPath();
        System.out.println(path3);

        File f6=new File("myFile\\a.txt");
        String path4=f6.getPath();
        System.out.println(path4);
        System.out.println("----------------------------");

        // 4 getName 获取名字
        //a 文件名
        // txt 后缀名

        //如果是文件夹:返回的就是文件夹的名字
        File f7=new File("E:\\测试\\a.txt");
        String name1 = f7.getName();
        System.out.println(name1);//a.txt

        File f8=new File("E:\\测试\\b");
        String name2=f8.getName();
        System.out.println(name2);//b
        System.out.println("----------------------------");

        // 5 lastModified 返回文件的最后修改时间(时间毫秒值)
        File f9=new File("E:\\测试\\a.txt");
        long time = f9.lastModified();//1675332819614
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH: mm: ss");
        Date a=new Date(time);
        String date = sdf.format(a);
        System.out.println(date);
        //System.out.println(time);
    }
}
