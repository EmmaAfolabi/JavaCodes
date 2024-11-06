package Chapter6;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input the three floating-point values
        System.out.print(
                "Enter three floating-point values separated by spaces: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        //determine the maximum value
        double result = maximum(number1, number2, number3);

        // display maximum value
        System.out.printf("Maximum is: %.2f%n", result);
    }

    // returns the maximum of it's three double parameters
    public static double maximum(double x, double y, double z) {
        double maximumValue = x; // assume x to be the largest to start

        // determine whether y is greater than maximumValue
        if (y > maximumValue) {
            maximumValue = y;
        }

        // determine whether z is greater than maximumvalue
        if (z > maximumValue) {
            maximumValue = z;
        }

        return maximumValue;
    }
}
