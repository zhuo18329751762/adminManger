package threadTest.threadTest7;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyCallable implements Callable<Integer> {
    //{10,5,20,50,100,200,500,800,2,80,300,700}
    //集合
    ArrayList<Integer> list=new ArrayList<>();

    public MyCallable(ArrayList<Integer> list) {
        this.list = list;
    }


    public void print(ArrayList<Integer> arrayList){
        System.out.println("在此次抽奖过程中，" + Thread.currentThread().getName() + "总共产生了" + arrayList.size() + "个奖项。");
        System.out.print("分别为:");
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
            sum = sum + arrayList.get(i);
            if (i != list.size() - 1) {
                System.out.print(arrayList.get(i) + ", ");
            } else {
                System.out.print(arrayList.get(i));
            }
        }
        Collections.sort(list);
        System.out.println("最高奖项为" + max + "总金额为" + sum);
    }

    @Override
    public Integer call() throws Exception {
        ArrayList<Integer> arrayList=new ArrayList();
        while (true) {
            synchronized (MyCallable.class) {
                if (list.size() == 0) {
                    print(arrayList);
                    break;
                } else {
                    Collections.shuffle(list);
                    Integer num = list.remove(0);
                    arrayList.add(num);
                }
                    Thread.sleep(10);
            }
        }
        //获取集合最大值
        if(arrayList.size()==0){
            return null;
        }else{
            return Collections.max(arrayList);
        }
    }
}
