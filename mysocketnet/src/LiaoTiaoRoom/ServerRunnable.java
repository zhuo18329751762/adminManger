package LiaoTiaoRoom;

import sockrtnetTest.Test6.MyRunnable;

import java.io.*;
import java.net.Socket;
import java.util.TreeMap;

public class ServerRunnable implements Runnable{
    Socket socket;
    TreeMap<String,String> tm;

    public ServerRunnable(Socket socket, TreeMap<String, String> tm) {
        this.socket = socket;
        this.tm = tm;
    }

    @Override
    public void run() {
        try {
            //获取输入流
            BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                String str = br.readLine();
                switch (str) {
                    case "login" -> login(socket, tm);
                    case "register" -> System.out.println("注册");
                }
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
    private static void login(Socket socket, TreeMap<String, String> tm) throws IOException {
        //登录
        //获取输入流
        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //获取输出流
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String str = br.readLine();
        String[] arr = str.split("=");
        String name=arr[0];
        String passWord=arr[1];
        if(tm.containsKey(name)){
            //用户名存在
            if(passWord.equals(tm.get(name))){
                //登陆成功
                bw.write("登陆成功");
                bw.flush();
                //登录成功的时候，就需要把客户端的连接对象Socket保存起来
                Server.list.add(socket);
                //写一个while(){}表示正在聊天
                //接收客户端发送过来的消息，并打印在控制台
                talk(br, name);
            }else{
                //密码错误
                bw.write("密码错误");
                bw.flush();
            }
        }else{
            //用户名不存在
            bw.write("用户名存在");
            bw.flush();
        }
    }
    private static void talk(BufferedReader br,String userName) throws IOException {
        while (true) {
            String message = br.readLine();
            System.out.println(userName + "发送过来消息：" + message);

            //群发
            for (Socket s : Server.list) {
                //s依次表示每一个客户端的连接对象
                writeMessage(s, userName + "发送过来消息：" + message);
            }
        }

    }
    private static void writeMessage(Socket socket,String message) throws IOException {
        //获取输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(message);
        bw.newLine();
        bw.flush();
    }
}
