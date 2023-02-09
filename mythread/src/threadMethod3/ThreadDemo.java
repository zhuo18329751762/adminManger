package threadMethod3;

public class ThreadDemo {
    public static void main(String[] args) {
        //设置守护线程
        //final void setDaemon(boolean on)
        //当其他的非守护线程执行完毕之后，守护线程会陆续结束

        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.setName("女神");
        t2.setName("备胎");
        //第二个设置为守护线程
        t2.setDaemon(true);
        t1.start();
        t2.start();
    }
}
