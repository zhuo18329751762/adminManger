package threadTest.threadTest1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Window extends Thread {
    static int count=1000;
    //创建锁的对象
    static Lock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true){
            lock.lock();//上锁
            try{
                if(count>0){
                    count--;
                    Thread.sleep(3);
                    System.out.println(getName()+"还剩"+count+"张票");
                }else{
                    break;
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }


        }
    }
}
