package Chapter8;
// static member demonstration.

public class Employee1Test {
    public static void main(String[] args) {
        // show that count is 0 before creating Employees
        System.out.printf("Employees before instantiation: %d%n",
                Employee1.getCount());

        // create two Employees; count should be 2
        Employee1 e1 = new Employee1("Susan", "Baker");
        Employee1 e2 = new Employee1("Bob", "Blue");

        // show that count is 2 after creating two employees
    }
}
