package threadcase3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /**
         * 多线程的第三种实现方式
         *      特点：可以获取到多线程的运行结果
         *      1.创建一个类MyCallable实现Callable接口
         *      2.重写call(返回值是多线程的运行结果)
         *      3.创建MyCallable的对象(表示多线程要执行的任务)
         *      4.创建FutureTask的对象(作用管理多线程)
         *      5.创建Thread类的对象，并启动(表示线程)
         */
        //1.创建一个类MyCallable实现Callable接口
        MyCallable mc=new MyCallable();
        //2.重写call(返回值是多线程的运行结果)
        FutureTask<Integer> ft=new FutureTask<>(mc);
        //创建线程的对象
        Thread t1=new Thread(ft);
        //启动线程
        t1.start();
        //获取多线程的运行结果
        Integer result = ft.get();
        System.out.println(result);
    }
}
