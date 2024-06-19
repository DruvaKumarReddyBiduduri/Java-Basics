package multithreading;

public class ThreadWithRunnable implements Runnable{
    @Override
    public void run() {
        for (char i = 'A'; i <= 'E'; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
