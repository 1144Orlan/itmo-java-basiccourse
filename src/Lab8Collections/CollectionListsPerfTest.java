package Lab8Collections;

import java.util.*;

public class CollectionListsPerfTest {
    private static final int ADD_COUNT = 1000000;
    private static final int ACCESS_COUNT = 100000;

    public static void main(String[] args) {
        // Test ArrayList
        long arrayListAddTime = testAdd(new ArrayList<>());
        List<Integer> filledArrayList = new ArrayList<>();
        fillList(filledArrayList);
        long arrayListAccessTime = testRandomAccess(filledArrayList);

        // Test LinkedList
        long linkedListAddTime = testAdd(new LinkedList<>());
        List<Integer> filledLinkedList = new LinkedList<>();
        fillList(filledLinkedList);
        long linkedListAccessTime = testRandomAccess(filledLinkedList);

        printResults(arrayListAddTime, linkedListAddTime, arrayListAccessTime, linkedListAccessTime);
    }

    private static long testAdd(List<Integer> list) {
        long startTime = System.nanoTime();

        for (int i = 0; i < ADD_COUNT; i++) {
            list.add(i);
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000; // Convert to milliseconds
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < ADD_COUNT; i++) {
            list.add(i);
        }
    }

    private static long testRandomAccess(List<Integer> list) {
        Random random = new Random();
        long startTime = System.nanoTime();

        for (int i = 0; i < ACCESS_COUNT; i++) {
            int randomIndex = random.nextInt(list.size());
            int value = list.get(randomIndex);
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000;
    }

    private static void printResults(long arrayListAddTime, long linkedListAddTime,
                                     long arrayListAccessTime, long linkedListAccessTime) {
        System.out.println("Performance Test Results");
        System.out.println("=======================");

        System.out.println("\nAdding " + ADD_COUNT + " elements:");
        System.out.println("ArrayList:  " + arrayListAddTime + " ms");
        System.out.println("LinkedList: " + linkedListAddTime + " ms");

        System.out.println("\nRandom access " + ACCESS_COUNT + " times:");
        System.out.println("ArrayList:  " + arrayListAccessTime + " ms");
        System.out.println("LinkedList: " + linkedListAccessTime + " ms");

        System.out.println("\nPerformance Comparison:");
        double addSpeedDiff = (double) linkedListAddTime / arrayListAddTime;
        double accessSpeedDiff = (double) linkedListAccessTime / arrayListAccessTime;
        System.out.printf("LinkedList is %.2fx slower for adding%n", addSpeedDiff);
        System.out.printf("LinkedList is %.2fx slower for random access%n", accessSpeedDiff);
    }
}
