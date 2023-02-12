package sockrtnetTest.Test6;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyRunnable implements Runnable{
    Socket socket;
    public MyRunnable(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run() {
        try {
            // 3 获取客户端数据并储存
            BufferedInputStream bis=new BufferedInputStream(socket.getInputStream());
            String name = UUID.randomUUID().toString().replace("-", "");
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("E:\\"+name+".jpg"));
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
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }finally {
            // 5 释放资源
            if(socket!=null) {
                try {
                    socket.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }
    }
}
