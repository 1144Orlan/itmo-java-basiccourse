package Lab6;

public class Truck extends Car {
    int numberOfWheels;
    int maxWeight;

    public Truck(int weight, String model, char color, float speed, int numberOfWheels, int maxWeight) {
        super(weight, model, color, speed);
        this.numberOfWheels = numberOfWheels;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;

        System.out.println("This truck have " + this.numberOfWheels + " wheels");
    }
}
