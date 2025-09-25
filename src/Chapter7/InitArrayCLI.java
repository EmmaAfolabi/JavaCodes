package Chapter7;
// Initializing an array using command-line arguments

public class InitArrayCLI {
    public static void main(String[] args) {
        // check number of command-line arguments
        if (args.length != 3) {
            System.out.printf(
                    "Error: Please re-enter the entire command, including%n" +
                    "an array size, initial value and increment.%n");
        }
        else {
            // get array size from first command-line argument
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];

            // get initial value and increment from command-line arguments
        }
    }
}
