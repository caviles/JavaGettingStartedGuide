package threads;

public class RunThread implements Runnable {
    @Override
    public void run() {
        System.out.println("This is the runnable run thread id " + Thread.currentThread().threadId());
    }
}
