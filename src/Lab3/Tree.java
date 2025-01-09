package Lab3;

public class Tree {
    private String nameOfTree;
    private int age;
    private boolean isAlive;

    public Tree(String nameOfTree, int age) {
        this.nameOfTree = nameOfTree;
        this.age = age;
    }

    public Tree(String nameOfTree, int age, boolean isAlive) {
        this.nameOfTree = nameOfTree;
        this.age = age;
        this.isAlive = isAlive;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }
}
