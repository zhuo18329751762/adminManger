package threadTest.threadTest6;


import java.util.ArrayList;
import java.util.Collections;

public class threadDemo {
    public static void main(String[] args) {
        /**
         * 有一个抽奖池，该抽奖池中存放了奖励的金额，该抽奖池中的奖项为
         * {10,5,20,50,100,200,500,800,2,80,300,700};
         * 创建两个抽奖箱(线程)设置线程名称分别为“抽奖箱1”，“抽奖箱2”
         * 随机从抽奖池中获取奖项元素并打印在控制台上，格式如下：
         * 每次抽出一个奖项就打印一个(随机)
         * 抽奖箱1又产生了一个10元大奖
         * 抽奖箱1又产生了一个100元大奖
         * 抽奖箱1又产生了一个200元大奖
         * 抽奖箱1又产生了一个800元大奖
         * 抽奖箱2又产生了一个700元大奖
         * ……
         * 每次抽的过程中，不打印，抽完时一次性打印(随机)
         * 在此次抽奖过程中，抽奖箱1总共产生了6个奖项。
         * 分别为:10,20,100,500,2,300最高奖项为300元,总计额为932元在此次抽奖过程中，抽奖箱2总共产生了6个奖项。
         * 分别为:5,50,200,800,80,700最高奖项为800元,总计额为1835元
         */
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);
        MyThread m1=new MyThread(list);
        MyThread m2=new MyThread(list);
        m1.setName("抽奖箱1");
        m2.setName("抽奖箱2");
        m1.start();
        m2.start();
    }
}
