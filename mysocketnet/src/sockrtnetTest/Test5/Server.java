package sockrtnetTest.Test5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        //想要服务器不停止，能接收很多用户上传的图片
        //可以使用多线程或者循环
        //接收客户端上传的文件，上传完毕之后给出反馈
        //解决文件名重复问题
        //接收客户端上传的文件，上传完毕之后给出反馈
        // 1 创建socket对象
        ServerSocket ss=new ServerSocket(10001);
        while (true) {
            // 2 等待客户端连接
            Socket socket = ss.accept();
            //开启一条线程
            new Thread(new MyRunnable(socket)).start();
        }
    }
}
