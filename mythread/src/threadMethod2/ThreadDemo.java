package threadMethod2;

import threadcase1.MyThread;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
        setPriority(int newPriority)    设置线程的优先级
        final int getPriority()         获取线程的优先级
         */
        //创建要执行的参数对象
        MyRunnable mr=new MyRunnable();
        //创建线程对象
        Thread t1=new Thread(mr,"坦克");
        Thread t2=new Thread(mr,"飞机");
//        System.out.println(t1.getPriority());//默认线程优先级是5
//        System.out.println(t2.getPriority());//默认线程优先级是5
//        System.out.println(Thread.currentThread().getPriority());
        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        t2.start();
    }
}
