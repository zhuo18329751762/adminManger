package charstream;

import java.io.FileReader;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        // 1 创建对象
        FileReader fr=new FileReader("myio\\a.txt");
        // 2 读取数据
        //字符流的底层也是字节流，默认也是一个字节一个字节的读取的
        //如果遇到中文就会一次读取多个，GBK一次读两个字节，UTF-8一次读三个字节
        int ch;
        while ((ch=fr.read())!=-1){
            System.out.print((char)ch);
        }
        // 3 释放资源
        fr.close();

    }
}
