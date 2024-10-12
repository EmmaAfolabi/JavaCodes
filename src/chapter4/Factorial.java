package chapter4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a non-negative integer: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Error! input must be a non-negative integer.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.printf("The factorial of %d is %d%n", number, factorial);
        }
    }
}
