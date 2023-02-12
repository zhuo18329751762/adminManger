package sockrtnetTest.Test1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //多次发送数据
        // 1 创建Socket对象
        Socket socket=new Socket("127.0.0.1",10086);
        Scanner sc=new Scanner(System.in);
        OutputStream os = socket.getOutputStream();
        while (true) {
            // 2 从连接通道中获取输出流
            System.out.println("请输入信息:");
            String str = sc.nextLine();
            // 3 写出数据
            os.write(str.getBytes());
            if(str.equals("886")){
                break;
            }
        }
        // 4 释放资源
        socket.close();

    }
}
