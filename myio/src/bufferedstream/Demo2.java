package bufferedstream;

import java.io.*;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        /*
        需求:利用字节缓冲流拷贝文件
         */
        // 1 创建缓冲流对象
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("myio\\a.txt"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("myio\\copy2.txt"));

        // 2 拷贝
        int len;
        byte[] arr=new byte[1024];
        while ((len=bis.read(arr))!=-1){
            bos.write(arr,0,len);
        }
        // 3 关流
        bos.close();
        bis.close();
    }
}
