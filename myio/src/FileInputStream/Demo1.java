package FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        /*
        字节输入流FileInputStream
        实现需求：读取文件中的数据(暂时不写中文)
        实现步骤：
            创建对象
            读取资源
            释放资源
         */
        // 1 创建对象
        FileInputStream fis=new FileInputStream("myio\\a.txt");
        // 2 读取数据
        int b1 = fis.read();
        System.out.println((char)b1);
        // 3 关闭
        fis.close();
    }
}
