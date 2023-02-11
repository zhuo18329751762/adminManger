package threadTest.threadTest2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class gift extends Thread{
    static int count=100;
    static Lock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true){
            lock.lock();
            if(count>10){
                count--;
                System.out.println(getName()+"送出了礼物,还剩"+count+"份礼物");
            }else{
                break;
            }
            lock.unlock();

        }
    }
}
