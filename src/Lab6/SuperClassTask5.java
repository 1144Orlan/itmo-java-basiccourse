package Lab6;

import java.util.Scanner;

public class SuperClassTask5 {
    protected Scanner scanner;
    protected int age;

    public SuperClassTask5() {
        scanner = new Scanner(System.in);
    }

    public int getInfo() {
        System.out.print("Enter age: ");
        age = scanner.nextInt();
        System.out.print("Age : " + age + "\n");
        return age;
    }
}
