package Lab6;

public class BankEmployee extends Person {
    String bankName;

    public BankEmployee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }


    @Override
    protected void getAllPersonInfo() {
        System.out.println(getName() + " " + getSurname() + " " + "- " + "'" + bankName + "'" + " employee");
    }
}
