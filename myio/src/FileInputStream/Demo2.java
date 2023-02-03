package FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        /*
        字节输入流的细节
            1.创建字节输入流对象
                细节1；如果文件不存在，就直接报错
                Java为什么会这么设计
                输出流：不存在，创建
                输入流：不存在，报错  因为创建出来的文件是空的，没有意义
            2.写数据
                细节1：一次只读一个字节，读出来的是数据在Ascii上对应的数字
                细节2：读到文件末尾了，read方法返回-1
            3.释放资源
                每次使用完流之后要记得释放资源
         */
        // 1 创建对象
        FileInputStream fis=new FileInputStream("myio\\b.txt");
        // 2 读取数据
        int b1 = fis.read();
        System.out.println((char)b1);
        // 3 关闭
        fis.close();
    }
}
