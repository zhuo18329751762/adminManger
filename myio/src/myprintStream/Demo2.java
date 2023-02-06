package myprintStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        /*
        字符打印流
         */
        // 1 创建字符打印流的对象
        PrintWriter pw=new PrintWriter(new FileWriter("myio\\a.txt"),true);
        // 2 写出数据
        pw.println("今天是个好日子");
        pw.println(true);
        pw.printf("%s爱上了%s","阿珍","阿强");
        pw.close();
    }
}
