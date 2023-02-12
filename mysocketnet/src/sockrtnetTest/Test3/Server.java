package sockrtnetTest.Test3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //接收客户端上传的文件，上传完毕之后给出反馈
        // 1 创建socket对象
        ServerSocket ss=new ServerSocket(10001);
        // 2 等待客户端连接
        Socket socket = ss.accept();
        // 3 获取客户端数据并储存
        BufferedInputStream bis=new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("E:\\图片.jpg"));
        int len;
        byte[] bytes=new byte[1024];
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
       // 4 往客户端回写数据
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String str="数据已储存!!!";
        bw.write(str);
        bw.newLine();
        bw.close();
        socket.shutdownOutput();
        // 5 释放资源
        bos.close();
        ss.close();


    }
}
