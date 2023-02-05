package transformStream;

import java.io.*;
import java.nio.charset.Charset;

public class Test3 {
    public static void main(String[] args) throws IOException {
        /*
        利用转换流按照指定字符编码写出
         */

        //了解
//        // 1 创建对象
//        OutputStreamWriter osw=new OutputStreamWriter
//                (new FileOutputStream("myio\\d.txt"),"GBK");
//        // 2 写出数据
//        osw.write("你好啊");
//        // 3 释放
//        osw.close();

        //掌握
        FileWriter fw=new FileWriter("myio\\d.txt", Charset.forName("GBK"));
        fw.write("只因你太美");
        fw.close();
    }
}
