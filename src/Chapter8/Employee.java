package Chapter8;
// Employee class with references to other objects

public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    // constructor to initialize name, birthdate and hire date
    public Employee(String firstName, String lastName, Date birthDate,
                    Date hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    // convert Employee to String format
    public String toString() {
        return String.format("%s, %s  Hired: %s  Birthday: %s",
                lastName, firstName, hireDate, birthDate);
    }
}
