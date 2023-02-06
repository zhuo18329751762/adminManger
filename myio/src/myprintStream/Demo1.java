package myprintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class Demo1 {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        字节打印流
         */
        // 1 创建字节打印流的对象
        PrintStream ps=new PrintStream(
                new FileOutputStream("myio\\a.txt"),true, Charset.forName("UTF-8"));
        // 2 写出数据
        ps.println(97);//写出+自动刷新+自动换行
        ps.print(true);
        ps.println();
        ps.printf("%s爱上了%s","阿珍","阿强");
        // 3 释放资源
        ps.close();
    }
}
