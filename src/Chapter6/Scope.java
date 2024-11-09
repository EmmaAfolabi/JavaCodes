package Chapter6;


public class Scope {
    // field that is accessible to all methods of this class
    private static int x = 1;

    // method main creates adn initializes local variable x
    // and calls method useLocalVariable and useField
    public static void main(String[] args) {
        int x = 5;  // method's local variable x shadows field x

        System.out.printf("local x in main is %d%n", x);

        useLocalVariable();
        useField();
        useLocalVariable();
        useField();

        System.out.printf("%n local x is main is %d%n", x);
    }

    // create and initialize local variable x during each call
    public static void useLocalVariable() {

    }
}
