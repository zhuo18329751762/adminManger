package threadTest.threadTest3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class getNum extends Thread{
    static int num=100;
    static Lock lock=new ReentrantLock();

    @Override
    public void run() {
        while (true){
            lock.lock();
            if(num>=1){
                if((num%2)==1){
                    System.out.println(getName()+"输出了"+num);
                    num--;
                }else{
                    num--;
                }
            }else{
                break;
            }
            lock.unlock();
        }
    }
}
