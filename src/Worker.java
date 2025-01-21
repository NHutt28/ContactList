public class Worker extends Person{
    // Instance variable
    private double wage;
    // Constructor
    public Worker(String firstName, String lastName, String phoneNumber, double wage) {
        super(firstName, lastName, phoneNumber);
        this.wage = wage;
    }
    // Getter
    public double getWage() {
        return wage;
    }
    // toString
    @Override
    public String toString() {
        return super.getFirstName() + " " + super.getLastName() + " -#" + super.getPhoneNumber() +
                " Wage:" + wage;
    }
}
