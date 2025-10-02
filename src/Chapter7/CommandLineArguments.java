package Chapter7;

public class CommandLineArguments {
    public static void main(String[] args) {
        // check if there are any command-line arguments
        if (args.length == 0) {
            System.out.println("Please provide numbers as command-line arguments.");
            return;
        }

        try {
            // convert first argument to initialize min and max
            double min = Double.parseDouble(args[0]);
            double max = min;

            // loop through remaining arguments
            for (int i = 1; i < args.length; i++) {
                double num = Double.parseDouble(args[i]);
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }

            // compute the average of min and max
            double average = (min + max) / 2.0;

            // print results
            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
            System.out.println("Average of min and max: " + average);

        } catch (NumberFormatException e) {
            System.out.println("Error: All command-line arguments must be numbers.");
        }
    }
}
