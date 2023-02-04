package charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        // 1 创建对象
        FileReader fr=new FileReader("myio\\a.txt");
        // 2 读取数据
        char[] chars=new char[1024];
        int len;
        while ((len=fr.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
        // 3 释放资源
        fr.close();
    }
}
