package threadMethod1;

public class Demo1 {
    /*
    当JVM虚拟机启动之后，会自动的启动多条线程
    其中有一条线程就叫main线程
    他的作用就是去调用main方法，并执行里面的代码
    在以前,我们写的所有代码，其实都是运行在main线程之中
     */
    public static void main(String[] args) throws InterruptedException {
        /*
        String getName()    返回此线程的名字
        void setName(String name)   设置线程的名字(构造方法也可以设置名字)
         1 即便没有给线程设置名字，线程也是有默认名字的
        格式:Thread-X(X序号，从0开始)
         2 也可以用构造方法设置名字

        static Thread currentThread()   获取当前线程的对象
        static void sleep(long time)    让线程休眠指定的时间，单位为毫秒
         1 哪条线程执行到这个方法，那么哪条线程就会在这里停留对应的时间
         2 方法的参数：就表示睡眠的时间，单位毫秒
         3 当时间到了之后，线程就会自动的醒来，继续执行下面的其他代码
         */
        // 1 创建线程的对象
        MyThread t1=new MyThread("飞机");
        MyThread t2=new MyThread("坦克");
//        // 2 设置名字
//        t1.setName("线程一");
//        t2.setName("线程二");
        // 3 开启线程
//        t1.start();
//        t2.start();

//        Thread t=Thread.currentThread();
//       String name=t.getName();
//        System.out.println(name);
        System.out.println("11111111111111");
        Thread.sleep(5000);
        System.out.println("22222222222222");
    }
}
