package sockrtnetTest.Test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //多次接收数据，并打印
        // 1 创建对象
        ServerSocket ss=new ServerSocket(10086);
        // 2 监听客户端的连接
        Socket socket = ss.accept();
        // 3 从连接通道中获取输入流接收数据
        InputStreamReader isr= new InputStreamReader(socket.getInputStream());
        int b;
        while ((b=isr.read())!=-1){
            System.out.print((char)b);
        }
        // 4 释放资源
        socket.close();
        ss.close();
    }
}
