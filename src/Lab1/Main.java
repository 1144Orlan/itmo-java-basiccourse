package Lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");

        //task 2
        int a = 46;
        int b = 10;
        double c = 10;
        int d = 3;
        int e = 29;
        int f = 4;
        int g = -15;
        double resultFirstExpression = (a + b) * (c / d);
        int resultSecondExpression = e * f * g;

        System.out.println(resultFirstExpression);
        System.out.println(resultSecondExpression);

        //task 3
        double number = 10500;
        double result = (number / 10) / 10;

        System.out.println(result);

        //task 4
        double num1 = 3.6;
        double num2 = 4.1;
        double num3 = 5.9;
        double multiplicationResult = num1 * num2 * num3;

        System.out.println(multiplicationResult);

        //task 5
        Scanner scanner = new Scanner(System.in);
        int intNumber1 = scanner.nextInt();
        int intNumber2 = scanner.nextInt();
        int intNumber3 = scanner.nextInt();

        System.out.println(intNumber1);
        System.out.println(intNumber2);
        System.out.println(intNumber3);

        //task 6
        int bNumber = scanner.nextInt();

        if (bNumber % 2 != 0) {
            System.out.println("Нечётное");
        } else if (bNumber % 2 == 0 & bNumber < 100) {
            System.out.println("Чётное");
        } else {
            System.out.println("Выход за пределы диапазона");
        }
    }
}