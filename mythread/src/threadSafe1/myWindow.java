package threadSafe1;

public class myWindow extends Thread {
    //static 表示这个类所有的对象，都共享ticket数据
    static int ticket = 0;//0~99

    //创建的锁对象一定要是唯一的
    //static Object obj=new Object();
    @Override
    public void run() {
        while (true) {
            //同步代码块
                synchronized (myWindow.class){
                    if (ticket < 100) {
                        ticket++;
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(getName() + "正在卖第" + ticket + "张票!!!");
                    } else {
                        System.out.println("票已售空");
                        break;
                    }
                }
            }
        }
    }
