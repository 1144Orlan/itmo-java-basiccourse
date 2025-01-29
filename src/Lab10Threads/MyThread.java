package Lab10Threads;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is in the " + Thread.currentThread().getState()
                + " state during execution."); //output for task 2
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
