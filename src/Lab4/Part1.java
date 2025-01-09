package Lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Part1 {

    public static void main(String[] args) {

        //1
        oddNumbersFromTheRange();

        //2
        hundredDivider();

        //3
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите первое число: ");
        int firstInt = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondInt = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int thirdInt = scanner.nextInt();
        System.out.println("Результат: " + isItEqualThirdInt(firstInt, secondInt, thirdInt));

        //4
        System.out.println("Результат: " + isEachNextNumberGreaterThanThePreviousOne(firstInt, secondInt, thirdInt));

        //5
        int[] ints = new int[]{3, -3, 7, 4, 5, 4, 3};
        System.out.println("array = " + Arrays.toString(ints));
        System.out.println(is3FirstOrLast(ints));

        //6
        System.out.println(isExist1Or3InArray(ints));


    }

    //1
    public static void oddNumbersFromTheRange() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    //2
    public static void hundredDivider() {
        System.out.print("Делится на 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.print("\nДелится на 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.print("\nДелится на 3 и на 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    //3
    public static boolean isItEqualThirdInt(int firstInt, int secondInt, int thirdInt) {
        if (firstInt + secondInt == thirdInt) {
            return true;
        } else {
            return false;
        }
    }

    //4
    public static boolean isEachNextNumberGreaterThanThePreviousOne(int firstInt, int secondInt, int thirdInt) {
        if (secondInt > firstInt && thirdInt > secondInt) {
            return true;
        } else {
            return false;
        }
    }

    //5
    public static boolean is3FirstOrLast(int[] ints) {
        if (ints[0] == 3 || ints[ints.length - 1] == 3) {
            return true;
        } else {
            return false;
        }
    }

    //6
    public static boolean isExist1Or3InArray(int[] ints) {
        for (int number : ints) {
            if (number == 1 || number == 3) {
                return true;
            }
        }
        return false;
    }

}
