package Lab10Threads;

public class Counter {
    int count = 0;

    public synchronized void increment() { //add synchronized
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}