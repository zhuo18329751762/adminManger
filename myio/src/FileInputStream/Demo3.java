package FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        /*
        字节输入流循环读取
         */
        // 1 创建对象
        FileInputStream fis=new FileInputStream("myio\\a.txt");

        // 2 读取
        int b;
        while ((b=fis.read())!=-1){
            System.out.print((char) b);
        }

        // 3 关闭
        fis.close();

    }
}
