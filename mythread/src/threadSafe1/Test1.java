package threadSafe1;

public class Test1 {
    public static void main(String[] args) {
        /**
         * 需求
         * 某电影院正在上映国产大片，共有100张票，而它有3个窗口卖票
         */
        // 1 创建线程对象
        myWindow w1=new myWindow();
        myWindow w2=new myWindow();
        myWindow w3=new myWindow();
        // 2 起名字
        w1.setName("窗口一");
        w2.setName("窗口二");
        w3.setName("窗口三");
        // 3 开始运行
        w1.start();
        w2.start();
        w3.start();
    }
}
