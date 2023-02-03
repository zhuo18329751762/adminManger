package FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        /*
        换行写:
                windows: \r\n
                Linux:   \n
                Mac:     \r

        续写:
                如果想要续写，打开续写开关即可
                开关位置：创建对象的第二个参数
                默认false：表示关闭续写，此时创建对象会清空文件
                手动传递true：表示打开续写，此时创建对象不会清空对象6
         */
        // 1 创建对象
        FileOutputStream fos=new FileOutputStream("myio\\a.txt",true);
        // 2 写出数据
        String str="张三爱李四";
        byte[] arr = str.getBytes();
        fos.write(arr);

        String wrap="\r\n";
        byte[] arr2 = wrap.getBytes();
        fos.write(arr2);

        String str1="666";
        byte[] arr1 = str1.getBytes();
        fos.write(arr1);


        // 3 释放资源
        fos.close();
    }
}
