package Lab3;

import java.time.Year;

public class House {
    private static int floorsQuantity;
    private static int yearOfConstruction;
    private static String designation;


    public static void setHouseData(int floors, int yearConstruct, String name) {
        floorsQuantity = floors;
        yearOfConstruction = yearConstruct;
        designation = name;
    }

    public static int houseAge() {
        return Year.now().getValue() - yearOfConstruction;
    }

    public static void showHouseData() {
        System.out.println("---------");
        System.out.println("Designation: " + designation);
        System.out.println("Floors: " + floorsQuantity);
        System.out.println("Year of construction: " + yearOfConstruction);
        System.out.println("Age of house: " + houseAge() + " years");
        System.out.println("---------");
    }
}
