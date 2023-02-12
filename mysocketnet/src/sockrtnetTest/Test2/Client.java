package sockrtnetTest.Test2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //发送一条数据，接收服务端反馈的消息并打印
        //多次发送数据
        // 1 创建Socket对象
        Socket socket=new Socket("127.0.0.1",10086);
        // 2 从连接通道中获取输出流
        Scanner sc=new Scanner(System.in);
        OutputStream os = socket.getOutputStream();
        InputStreamReader isr=new InputStreamReader(socket.getInputStream());
        while (true) {
            System.out.println("请输入信息:");
            String str = sc.nextLine();
            // 3 写出数据
            os.write(str.getBytes());
            //写出一个结束标记
            socket.shutdownOutput();
            if(str.equals("886")){
                break;
            }
            // 4 接收服务端回写的数据
            int b;
            while ((b=isr.read())!=-1){
                System.out.print((char) b);
            }
            System.out.println();
        }
        // 4 释放资源
        socket.close();
    }
}
