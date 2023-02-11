package threadTest.threadTest2;

public class threadTest {
    public static void main(String[] args) {
        /*
        有100份礼品，两人同时发送，当剩下的礼品小于10份的时候则不再送出
        利用多线程模拟该过程并将线程的名字和礼物的剩余数量打印出来
         */
        gift g1=new gift();
        gift g2=new gift();
        g1.start();
        g2.start();
    }
}
