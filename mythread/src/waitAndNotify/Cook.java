package waitAndNotify;

public class Cook extends Thread{
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
                    //判断桌子上是否有食物
                    if(Desk.foodFlag==1){
                        //如果有,就等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else{
                        //如果没有，就制作食物
                        System.out.println("厨师做了一碗面条");
                        //Desk.count++;
                        //修改桌子上的食物状态
                        Desk.foodFlag=1;
                        //叫醒等待的消费者
                        Desk.lock.notifyAll();
                    }




                }
            }
        }

    }
}
