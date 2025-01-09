package Lab3;

public class SimpleCar {
    private String color;
    private String name;
    private int weight;

    public SimpleCar(String color) {
        this.color = color;
    }

    public SimpleCar(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public SimpleCar() {
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "SimpleCar{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
