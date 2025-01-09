package Lab2;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.addition(2.5,2.5));

        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Лабрадор", "Боня", 6, true);

        System.out.println(dog1);
        System.out.println(dog2);
    }
}
