package Lab3;

public class Main {
    public static void main(String[] args) {

        //task1
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());

        //task2
        SimpleCar car1 = new SimpleCar();
        car1.setColor("Black");
        car1.setName("BMW");
        car1.setWeight(3155);

        SimpleCar car2 = new SimpleCar();
        car2.setColor("Silver metallic");
        car2.setName("Volkswagen");
        car2.setWeight(1950);

        System.out.println(car1);
        System.out.println(car2);

        //task3
        House.setHouseData(12, 1975, "Apartment building");
        House.showHouseData();

        House.setHouseData(3, 1754, "The Winter Palace");
        House.showHouseData();

        //task4
        Tree tree1 = new Tree("Birch", 45);
        Tree tree2 = new Tree("Oak", 375, true);
        Tree tree3 = new Tree();
    }
}
