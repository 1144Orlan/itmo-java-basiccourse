package Lab10Threads;

public class Main {
    private static volatile int completedThreads = 0; // for task 3

    public static void main(String[] args) {

        //1
        for (int i = 0; i < 10; i++) {
            new MyThread().start();
        }

        //2
        Thread myThread = new MyThread();
        System.out.println(myThread.getName() + " is in the " + myThread.getState()
                + " state before execution.");
        myThread.start();
        try {
            myThread.join();
            System.out.println(myThread.getName() + " is in the " + myThread.getState()
                    + " state after the finished work.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //3
        Counter counter = new Counter(); // added volatile completedThreads
        Thread[] threads = new Thread[100];

        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        counter.increment();
                    }
                    completedThreads++;
                }
            });
            threads[i].start();
        }

        while (completedThreads < 100) {
            Thread.yield();
        }
        System.out.println("Final count: " + counter.getCount());

        //4
        Thread thread1 = new Thread(new ThreadNamePrinter(true), "Thread-1");
        Thread thread2 = new Thread(new ThreadNamePrinter(false), "Thread-2");
        thread1.start();
        thread2.start();
    }
}
