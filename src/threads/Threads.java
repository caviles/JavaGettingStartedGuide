package threads;

public class Threads {

    public static void TryThreads(){

        System.out.println("This is the Main thread id " + Thread.currentThread().threadId());
        Thread t = new Thread(() -> System.out.println("This is the new thread id " +Thread.currentThread().threadId()));
        Thread t2 = new Thread(() -> System.out.println("This is the new thread2 id " +Thread.currentThread().threadId()));
        t.start(); // no guarentee of order this may run after t2
        t2.start();
    }

    public static void TryJoinThreads(){

        System.out.println("This is the Main thread id " + Thread.currentThread().threadId());
        Thread t = new Thread(() -> System.out.println("This is the new thread id " +Thread.currentThread().threadId()));
        Thread t2 = new Thread(() -> System.out.println("This is the new thread2 id " +Thread.currentThread().threadId()));
        t.start(); // no guarentee of order this may run after t2
        try {
            t.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        t2.start();
    }

    //a runnable cannot return a result and
    // must handle it's own exceptions because the other thread can't interact w/ it
    public static void TryRunnable(){
        Thread t = new Thread(new RunThread());
        t.start(); // no guarentee of order this may run after t2
    }

    //a callable can return value and can have checked exceptions
    public static void TryCallable(){

        System.out.println("This is the Main thread id " + Thread.currentThread().threadId());
        Thread t = new Thread(() -> System.out.println("This is the new thread id " +Thread.currentThread().threadId()));
        Thread t2 = new Thread(() -> System.out.println("This is the new thread2 id " +Thread.currentThread().threadId()));
        t.start(); // no guarentee of order this may run after t2
        t2.start();
    }


    int answer = 0;
    public synchronized void synchronisedCalculate(int a, int b) {
        answer = a + b;
    }
}
