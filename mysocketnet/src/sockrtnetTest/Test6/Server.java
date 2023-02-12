package sockrtnetTest.Test6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String[] args) throws IOException {
        //接收客户端上传的文件，上传完毕之后给出反馈
        //频繁创建线程并销毁非常浪费系统资源，所以需要线程池优化
        //想要服务器不停止，能接收很多用户上传的图片
        //可以使用多线程或者循环
        //接收客户端上传的文件，上传完毕之后给出反馈
        //解决文件名重复问题
        //接收客户端上传的文件，上传完毕之后给出反馈

        //创建线程池对象
        ThreadPoolExecutor pool=new ThreadPoolExecutor(
                3,//核心线程数量
                16,//线程池总大小
                60,//空闲时间
                TimeUnit.MINUTES,//空闲时间单位
                new ArrayBlockingQueue<>(2),//队列
                Executors.defaultThreadFactory(),//线程工厂，让线程池如何创建线程对象
                new ThreadPoolExecutor.AbortPolicy()//阻塞队列
        );
        // 1 创建socket对象
        ServerSocket ss = new ServerSocket(10001);
        while (true) {
            // 2 等待客户端连接
            Socket socket = ss.accept();
            //开启一条线程
            pool.submit(new MyRunnable(socket));
        }
    }
}
