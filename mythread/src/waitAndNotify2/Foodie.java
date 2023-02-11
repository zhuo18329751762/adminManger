package waitAndNotify2;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{
    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        while (true){
            //不断把面条放到阻塞队列中
            try{
                queue.put("面条");
                System.out.println("厨师放了一碗面条");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
