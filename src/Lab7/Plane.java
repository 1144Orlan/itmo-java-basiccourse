package Lab7;

public class Plane {

    class Wing {
        double wingWeight;

        void showWingWeight(double weight) {
            this.wingWeight = weight;
            System.out.println("Weight of wing this plane is " + wingWeight + " kg");
        }
    }

    public void wingInnerMethodCall(double weight) {
        Wing wing = new Wing();
        wing.showWingWeight(weight);
    }

    public static void main(String[] args) {

        Plane plane1 = new Plane();
        plane1.wingInnerMethodCall(3000);

        Plane plane2 = new Plane();
        plane2.wingInnerMethodCall(1700);

    }
}