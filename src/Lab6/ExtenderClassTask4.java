package Lab6;

public class ExtenderClassTask4 extends SuperClassTask4 {

    public ExtenderClassTask4(int intNumber) {
        super(intNumber);
    }

    public void fieldFromSuperClass() {
        System.out.println("Number in superclass field: " + super.intNumber);
    }
}
