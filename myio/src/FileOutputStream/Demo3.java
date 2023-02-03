package FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        // 1 创建对象
        FileOutputStream fos=new FileOutputStream("myio\\a.txt");
        // 2 写出数据
//        fos.write(97);
//        fos.write(98);
        byte[] bytes={97,98,99,100,101};
//        fos.write(bytes);
        fos.write(bytes,2,3);
        // 3 释放资源
        fos.close();
    }
}
