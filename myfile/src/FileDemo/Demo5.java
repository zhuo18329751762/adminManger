package FileDemo;

import java.io.File;

public class Demo5 {
    public static void main(String[] args) {
        //delete()             删除文件，空文件夹
        //如果删除的是文件，则直接删除，不走回收站
        //如果删除的是文件夹，
        // 空文件夹，直接删除,
        // 非空文件夹,删除失败


        File f1=new File("E:\\测试\\a.txt");
        boolean b = f1.delete();
        System.out.println(b);
    }
}
