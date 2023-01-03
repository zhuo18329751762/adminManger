package Runtime;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        // 1 获取Runtime对象
        //Runtime r1=Runtime.getRuntime();

        // 2 停止虚拟机
        //Runtime.getRuntime().exit(1);

        // 3 获取cpu的线程数
        System.out.println(Runtime.getRuntime().availableProcessors());

        // 4 总内存大小，单位byte字节
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);//4066

        // 5 已经获取的总内存大小 单位byte字节
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);//256
        // 6 剩余内存大小
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);//253
        // 7 运行cmd命令
        //shutdown：关机
        //-s:默认一分钟后关机
        //-s -t 指定时间 ：指定关机
        //-a:取消关机操作
        //-r:关机并重启


        Runtime.getRuntime().exec("shutdown -a");
    }
}
