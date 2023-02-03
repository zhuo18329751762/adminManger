package ByteStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        /*
        字节输出流FileOutStream
        实现需求:写出一段文字到本地文件中(暂时不写中文)
        步骤:
            创建对象
            写出数据
            释放资源
         */

        // 1 创建对象
        //写出 输出流 OutputStream
        //本地文件 File
        FileOutputStream fos=new FileOutputStream("myio\\a.txt");
        //写入数据
        fos.write(97);
        //释放资源
        fos.close();

    }
}
