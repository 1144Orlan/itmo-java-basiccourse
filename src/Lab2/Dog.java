package Lab2;

public class Dog {
    private String name;
    private String breed;
    private int age;
    private boolean chipped;

    public Dog() {
        this.name = "Неизвестно";
        this.breed = "Дворняга";
        this.age = 0;
        this.chipped = false;
    }

    public Dog(String breed, String name, int age, boolean chipped) {
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.chipped = chipped;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isChipped() {
        return chipped;
    }

    public void setChipped(boolean chipped) {
        this.chipped = chipped;
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", chipped=" + chipped +
                '}';
    }
}
