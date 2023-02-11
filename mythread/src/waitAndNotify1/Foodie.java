package waitAndNotify1;

public class Foodie extends Thread{
    @Override
    public void run() {
        /*
        循环
        同步代码块
        判断共享数据是否到了末尾(到末尾)
        判断共享数据是否到了末尾(没到末尾，执行核心逻辑)
         */
        while (true){
            synchronized (Desk.lock){
                if(Desk.count==0){
                    break;
                }else{
                    //先判断桌子上是否有面条
                    if(Desk.foodFlag==0){
                        //如果没有等待
                        try {
                            Desk.lock.wait();//让当前线程跟锁进行绑定
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        //把吃的总数-1
                        Desk.count--;
                        //如果有，就开吃
                        System.out.println("吃货正在吃面条，还能吃"+Desk.count+"碗！！！");
                        //吃完之后，唤醒厨师继续做
                        Desk.lock.notifyAll();
                        //修改桌子的状态
                        Desk.foodFlag=0;
                    }
                }
            }
        }
    }
}
