package threadSafe2;

public class myRunnable implements Runnable{

    int ticket=0;
    @Override
    public void run() {
        // 1 循环
        // 2 同步代码块
        // 3 判断共享数据是否到了末尾，如果到了末尾
        // 4判断共享数据是否到了末尾，如果没到末尾
        while (true){
                if (menthod()) break;
            }
        }

    private synchronized boolean menthod() {
        if(ticket==100){
            return true;
        }else{
            ticket++;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"在卖第"+ticket+"张票!!!");
        }
        return false;
    }
}
