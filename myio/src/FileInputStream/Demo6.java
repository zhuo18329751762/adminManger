package FileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class Demo6 {
    public static void main(String[] args) throws IOException {
        /*
        文件拷贝
        把E:\测试\b\TG-2023-01-21-204108437.mp4拷贝到当前模块下
         */
        FileInputStream fip=new FileInputStream("E:\\测试\\b\\TG-2023-01-21-204108437.mp4");
        FileOutputStream fos=new FileOutputStream("myio\\copy.mp4");

        int len;
        byte[] arr=new byte[1024*1024*5];
        long a=System.currentTimeMillis();
        while ((len=fip.read(arr))!=-1){
            fos.write(arr,0,len);
        }
        long b=System.currentTimeMillis();
        System.out.println("用时"+(b-a)+"毫秒");
        //释放
        fos.close();
        fip.close();
    }
}
