package myprintStream;

import java.io.PrintStream;

public class Demo3 {
    public static void main(String[] args) {
        //打印流的应用场景


        //获取打印流的对象，此打印流在虚拟机启动时，由虚拟机创建，默认指向控制台
        //特殊的打印流，系统中的标准输出流,是不能关闭的，在系统中是唯一的
        PrintStream ps=System.out;
        //调用方法
        ps.println("123");
    }
}
