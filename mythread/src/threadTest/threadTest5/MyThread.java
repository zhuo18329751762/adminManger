package threadTest.threadTest5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{
    //{10,5,20,50,100,200,500,800,2,80,300,700}
    //集合
    ArrayList<Integer> list=new ArrayList<>();

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    static Lock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true){
            lock.lock();
            if(list.size()==0){
                break;
            }else{
                Collections.shuffle(list);
                Integer num = list.remove(0);
                System.out.println("抽奖箱"+getName()+"又产生了一个"+num+"元大奖");

            }
            lock.unlock();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
