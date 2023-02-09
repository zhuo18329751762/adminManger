package threadcase2;

public class MyRun implements Runnable{
    @Override
    public void run() {
        //书写线程要执行的代码
        Thread t=Thread.currentThread();
        for (int i = 0; i < 100; i++) {
            System.out.println(t.getName()+"Hello Word!");
        }
    }
}
