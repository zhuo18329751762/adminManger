package threadTest.threadTest4;

public class threadDemo {
    public static void main(String[] args) {
        /**
         * 抢红包
         * 假设：100块，分成了三个包，现在五个人去抢
         * 其中，红包共享数据
         * 5个人是5条线程
         * 打印结果如下：
         * xxx抢到了XXX元
         * xxx抢到了XXX元
         * xxx抢到了XXX元
         * xxx没抢到
         * xxx没抢到
         */
        myThread m1=new myThread();
        myThread m2=new myThread();
        myThread m3=new myThread();
        myThread m4=new myThread();
        myThread m5=new myThread();
        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
    }
}
