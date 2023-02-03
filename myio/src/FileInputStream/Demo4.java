package FileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Time;
import java.util.Date;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        /*
        文件拷贝
        把       E:\测试\b\TG-2023-01-21-204108437.mp4拷贝到当前模块下
        选择一个比较小的文件，不要太大
        课堂练习:
        要求统计一下拷贝时间，单位毫秒
         */
        // 1 创建对象
        FileInputStream fis=new FileInputStream("E:\\测试\\b\\TG-2023-01-21-204108437.mp4");
        FileOutputStream fos=new FileOutputStream("myio\\copy.mp4");
        long a= System.currentTimeMillis();
        // 2 拷贝
        int b;
        while((b=fis.read())!=-1){
            fos.write(b);
        }
        long c=System.currentTimeMillis();
        long time=c-a;
        System.out.println("用时"+time);//用时32552
        // 3 释放资源
        fos.close();
        fis.close();
    }
}
