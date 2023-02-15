package LiaoTiaoRoom;

import sockrtnetTest.Test6.MyRunnable;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.TreeMap;

public class Server {
    static ArrayList<Socket> list = new ArrayList<>();
    //服务端
    public static void main(String[] args) throws IOException {
        // 1 创建对象
        ServerSocket ss = new ServerSocket(10001);
        //读取文件中的用户信息
        TreeMap<String, String> tm = new TreeMap();
        BufferedReader br2 = new BufferedReader(new FileReader("mysocketnet\\a.txt"));
        String user;
        while ((user = br2.readLine()) != null) {
            String[] arr = user.split("=");
            String name = arr[0];
            String passWord = arr[1];
            tm.put(name, passWord);
        }
        //2.只要来了一个客户端，就开一条线程处理
        while (true) {
            Socket socket = ss.accept();
            System.out.println("有客户端来链接");
            new Thread(new ServerRunnable(socket, tm)).start();
        }
    }


}
