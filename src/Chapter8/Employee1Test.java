package Chapter8;
// static member demonstration.

public class Employee1Test {
    public static void main(String[] args) {
        // show that count is 0 before creating Employees
        System.out.printf("Employees before instantiation: %d%n",
                Employee1.getCount());
    }
}
