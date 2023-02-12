package sockrtnetTest.Test3;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //将本地文件上传到服务器。接收服务器的反馈
        // 1 创建socket对象，并连接服务器
        Socket socket=new Socket("127.0.0.1",10001);
        // 2 读取本地文件中的文件并写到服务器中
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("E:\\a.jpg"));
        BufferedOutputStream bos=new BufferedOutputStream(socket.getOutputStream());
        byte[] bytes=new byte[1024];
        int len;
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        //往服务器写出结束标记
        socket.shutdownOutput();
        // 3 接收服务器的回写数据
        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str = br.readLine();
        System.out.println(str);
        // 4 释放资源
        bis.close();
        socket.close();


    }
}
