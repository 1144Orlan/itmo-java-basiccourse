package Lab10Threads;

public class ThreadNamePrinter implements Runnable {
    private static Object lock = new Object();
    private static boolean isFirstThreadTurn = true;
    private boolean isFirstThread;
    private static volatile boolean running = true; // Termination timer (running, counter, MAX_ITERATIONS)
    private static int counter = 0;
    private static final int MAX_ITERATIONS = 100;

    public ThreadNamePrinter(boolean isFirstThread) {
        this.isFirstThread = isFirstThread;
    }

    @Override
    public void run() {
        while (running) {
            synchronized (lock) {
                while (isFirstThreadTurn != isFirstThread && running) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (counter < MAX_ITERATIONS) {
                    System.out.println(Thread.currentThread().getName());
                    counter++;
                    isFirstThreadTurn = !isFirstThreadTurn;
                    lock.notify();
                } else {
                    running = false;
                    lock.notify();
                }
            }
        }
    }
}