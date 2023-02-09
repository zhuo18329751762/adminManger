package threadSafe2;

import threadSafe1.myWindow;

public class Test1 {
    public static void main(String[] args) {
        /**
         * 需求
         * 某电影院正在上映国产大片，共有100张票，而它有3个窗口卖票
         */
        // 1 创建线程对象
        myRunnable mr=new myRunnable();
        Thread t1=new Thread(mr);
        Thread t2=new Thread(mr);
        Thread t3=new Thread(mr);
        // 2 起名字
        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");
        // 3 开始运行
        t1.start();
        t2.start();
        t3.start();
    }
}
