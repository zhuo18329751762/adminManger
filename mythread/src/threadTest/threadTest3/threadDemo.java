package threadTest.threadTest3;

public class threadDemo {
    public static void main(String[] args) {
        /**
         * 同时开启两个线程，共同获取1~100之间的所有数字
         * 要求：将输出所有的奇数
         */
        getNum g1=new getNum();
        getNum g2=new getNum();
        g1.start();
        g2.start();
    }
}
