package LiaoTiaoRoom;

import sockrtnetTest.Test6.MyRunnable;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",10001);
        System.out.println("服务器已连接成功!");
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("服务器已经连接成功");
            System.out.println("===============欢迎来到晓阳聊天室=============");
            System.out.println("1 登录");
            System.out.println("2 注册");
            System.out.println("请输入您的选择");
            String choose = sc.nextLine();
            switch (choose){
                case"1"->login(socket);
                case "2"-> System.out.println("注册");
                default -> System.out.println("输入有误");
            }
        }
    }

    private static void login(Socket socket) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name = sc.nextLine();
        System.out.println("请输入密码:");
        String passWord = sc.nextLine();
        //获取输出流
        String user=name+"="+passWord;
        //第一次是告诉服务器要进行登录操作
        bw.write("login");
        bw.newLine();
        bw.flush();
        //第二次是向服务器输出账号密码信息
        bw.write(user);
        bw.newLine();
        bw.flush();
        //读取服务器传送过来的信息
        //判断登录状态
        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str = br.readLine();
        if(str.equals("登陆成功")){
            System.out.println("登陆成功");
            //单独开辟一条线程，用来保存聊天记录
            new Thread(new ClientRunnable(socket)).start();
            //开始聊天
            talk(bw);
        }else if(str.equals("密码有误")){
            System.out.println("密码有误");
        }else if(str.equals("用户名不存在")){
            System.out.println("用户名不存在");
        }
    }

    private static void talk(BufferedWriter bw) throws IOException {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要说的话");
            String str = sc.nextLine();
            bw.write(str);
            bw.newLine();
            bw.flush();
        }
    }
}
