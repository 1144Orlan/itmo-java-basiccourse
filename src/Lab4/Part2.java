package Lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {

        //1
        //int[] ints = new int[]{3, -3, 7, 4, 5, 4, 3};
        int[] ints = new int[]{1, 2, 3, 4, 5};
        checkingThatTheArrayIsSortedInAscendingOrder(ints);

        //2
        displayTheEnteredArray();

        //3
        reverseTheFirstAndLastElementsOfTheArray(ints);

        //4
        int[] intsWithUniqNumber = new int[]{1, 2, 3, 1, 2, 4};
        firstUniqueNumberInArray(intsWithUniqNumber);

    }

    //1
    public static void checkingThatTheArrayIsSortedInAscendingOrder(int[] ints) {
        for (int i = 0; i < ints.length - 1; i++) {
            if (ints[i] > ints[i + 1]) {
                System.out.println("Please, try again");
                break;
            } else {
                System.out.println("OK");
                break;
            }
        }
    }

    //2
    public static void displayTheEnteredArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int arrayLength = scanner.nextInt();
        int[] ints = new int[arrayLength];
        System.out.println("Array length: " + ints.length);
        System.out.print("Numbers of array:\n");
        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(ints));
    }

    //3
    public static void reverseTheFirstAndLastElementsOfTheArray(int[] ints) {
        int firstElement = ints[0];
        int lastElement = ints[ints.length - 1];
        System.out.println("Array 1: " + Arrays.toString(ints));
        ints[0] = lastElement;
        ints[ints.length - 1] = firstElement;
        System.out.println("Array 2: " + Arrays.toString(ints));
    }

    //4
    public static void firstUniqueNumberInArray(int[] ints) {
        int firstUniqNumber = 0;
        boolean found = false;

        for (int i = 0; i < ints.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < ints.length; j++) {
                if (i == j) {
                    continue;
                }

                if (ints[i] == ints[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique && !found) {
                firstUniqNumber = ints[i];
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("First unique number in array: " + firstUniqNumber);
        }
    }
}
