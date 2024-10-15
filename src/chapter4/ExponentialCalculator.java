package chapter4;

import java.util.Scanner;

public class ExponentialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        double x = input.nextDouble();

        System.out.print("Enter the number of terms to calculate e^x: ");
        int terms = input.nextInt();

        if (terms < 0) {
            System.out.println("Error: The number of terms must be non-negative.");
        }else {
            double result = 1.0;
            double term = 1.0;

            for (int i = 1; i < terms; i++) {
                term *= x / i;
                result += term;
            }

            System.out.printf("Estimated value of e^%.2f using %d terms is: %.10f%n",x, terms, result);

        }
    }
}
