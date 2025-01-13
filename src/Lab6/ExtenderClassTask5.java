package Lab6;

public class ExtenderClassTask5 extends SuperClassTask5 {
    String username;

    @Override
    public int getInfo() {
        System.out.print("Enter username: ");
        username = scanner.nextLine();
        System.out.println("Username is: " + username);
        return age;
    }
}
