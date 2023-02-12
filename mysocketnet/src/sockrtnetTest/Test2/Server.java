package sockrtnetTest.Test2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    public static void main(String[] args) throws IOException {
        //接收数据并打印，再给客户端反馈消息
        // 1 创建对象
        ServerSocket ss=new ServerSocket(10086);
        // 2 监听客户端的连接
        Socket socket = ss.accept();

            OutputStream os = socket.getOutputStream();
            // 3 从连接通道中获取输入流接收数据
            InputStreamReader isr= new InputStreamReader(socket.getInputStream());
            int b;
            //read方法会从连接通道中读取数据
            //但是，需要一个结束标记，此处循环才会停止
            //否则，程序会一直停在read方法，等待读取下面的数据
            while ((b=isr.read())!=-1){
                System.out.print((char)b);
            }
            // 4 回写数据
            String str="服务端收到数据";
            os.write(str.getBytes());
            //写出一个结束标记
            socket.shutdownOutput();

//        // 5 释放数据
//        socket.close();
//        ss.close();
    }
}
