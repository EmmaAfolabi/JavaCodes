package Chapter6;

import java.util.Scanner;

public class RoundingNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter value to be rounded: ");
        double x = input.nextDouble();

        double y = Math.floor(x + 0.5);

        System.out.printf("Original value is: %f%n", x);
        System.out.printf("Rounded value is: %f%n", y);

        input.close();

    }
}
