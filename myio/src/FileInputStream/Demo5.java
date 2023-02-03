package FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo5 {
    public static void main(String[] args) throws IOException {
        /*
        public int read(byte[] buffer)  一次读一个字节数组数据
         */
        // 1 创建对象
        FileInputStream fis=new FileInputStream("myio\\a.txt");

        // 2 读取
        byte[] bytes=new byte[2];
        //一次读取多个字节数据，跟数组的长度有关
        int len = fis.read(bytes);
        System.out.println(len);
        String str=new String(bytes,0,len);
        System.out.println(str);

         len = fis.read(bytes);
        System.out.println(len);
        String str1=new String(bytes,0,len);
        System.out.println(str1);


        // 3 关闭
        fis.close();
    }
}
