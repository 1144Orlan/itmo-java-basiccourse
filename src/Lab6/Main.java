package Lab6;

public class Main {
    public static void main(String[] args) {

        Client client = new Client("John", "Brown", "JPMorgan Chase");
        client.getAllPersonInfo();

        BankEmployee employee = new BankEmployee("Amanda", "Norton", "Wells Fargo");
        employee.getAllPersonInfo();

        Truck truck = new Truck(7800, "Scania", 'b', 90, 6, 39000);
        truck.outPut();
        truck.newWheels(6);

        ExtenderClassTask4 extenderClassTask4 = new ExtenderClassTask4(777);
        extenderClassTask4.fieldFromSuperClass();

        SuperClassTask5 userAge = new SuperClassTask5();
        userAge.getInfo();
        ExtenderClassTask5 userName = new ExtenderClassTask5();
        userName.getInfo();
    }
}
