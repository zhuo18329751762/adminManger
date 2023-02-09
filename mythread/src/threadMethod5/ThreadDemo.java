package threadMethod5;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        /*
        public final void join()    插入线程/插队线程
         */
        MyThread t=new MyThread();
        t.setName("土豆");
        t.start();
        t.join();//表示把t这个线程，插入到当前线程之前
        //该线程t,当前线程main线程
        //main线程中执行
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"@"+i);
        }
    }
}
