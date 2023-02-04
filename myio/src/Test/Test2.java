package Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        /*
        加密原理：
        对原始文件中的每一个字节数据进行更改，然后将更改以后的数据存储到新的文件中
        解密原理：
        读取加密之后的文件，按照加密规则反向操作，变成原始文件

        ^:异或符号
        两边相同：false
        两边不同：true
         */
        FileInputStream fis=new FileInputStream("E:\\测试\\加密.txt");
        FileOutputStream fos=new FileOutputStream("E:\\测试\\解密.txt");

        int b;
        while ((b=fis.read())!=-1){
            System.out.println("1");
            fos.write(b^2);
        }

        //解密
        fos.close();
        fis.close();
    }

}
