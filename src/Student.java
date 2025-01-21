public class Student extends Person {
    // Instance variable
    private int grade;

    // Constructor
    public Student(String firstName, String lastName, String phoneNumber, int grade)
    {
        super(firstName,lastName,phoneNumber);
        this.grade = grade;
    }

    // Getter
    public int getGrade() {
        return grade;
    }

    //toString
    @Override
    public String toString() {
        return super.getFirstName() + " " + super.getLastName() + " -#" + super.getPhoneNumber() +
                " Grade:" + grade;
    }
}
