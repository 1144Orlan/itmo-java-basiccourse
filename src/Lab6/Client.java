package Lab6;

public class Client extends Person implements IPersonInfo{

    String bankName;

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "Client{" +
                "bankName='" + bankName + '\'' +
                '}';
    }

    @Override
    public void getAllPersonInfo() {
        System.out.println(getName() + " " + getSurname() + " " + "- Client of " + "'"+bankName+"'");
    }
}
