package threadTest.threadTest1;

public class Test1 {
    public static void main(String[] args) {
        /*
        一共有1000张电影票，可以在两个窗口领取，假设每次领取的时间为3000毫秒
        要求：用多线程模拟买票过程并打印剩余电影票的数量
         */
        //创建线程
        Window w1=new Window();
        Window w2=new Window();
        //运行
        w1.start();
        w2.start();

    }
}
