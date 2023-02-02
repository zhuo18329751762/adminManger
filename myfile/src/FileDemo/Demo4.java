package FileDemo;

import java.io.File;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        /*
        public boolean createNewFile()      创建一个新的空文件
        public boolean mkdir()              创建单级文件夹
        public boolean mkdirs()             创建多级文件夹
        public boolean delete()             删除文件，空文件夹
         */

        // 1 createNewFile() 创建一个新的空文件
        //      1 如果当前路径表示的文件是不存在的，则创建成功，方法返回true
        //   如果当前路径表示的文件是存在的，则创建失败，方法返回false

        //      2 如果父级路径不存在，那么方法会有异常IOException
        //      3 createNewFile()方法创建的一定是文件，如果没有后缀名，则创建一个没有后缀的文件
//        File f1=new File("E:\\测试\\d");
//        boolean b = f1.createNewFile();
//        System.out.println(b);

        // 2 mkdir()创建单级文件夹
        //      1 windows当中路径是唯一的，如果当前路径已经存在，则创建失败，返回false
        //      2 mkdir方法只能创建单级文件夹，不能创建多级文件夹
//        File f2=new File("E:\\测试\\e");
//        boolean b = f2.mkdir();
//        System.out.println(b);

        // 3 mkdir() 创建多级文件夹
        //既可以创建单级文件夹，又可以创建多级文件夹
        File f3=new File("E:\\测试\\f");
        boolean b = f3.mkdirs();
        System.out.println(b);
    }
}
