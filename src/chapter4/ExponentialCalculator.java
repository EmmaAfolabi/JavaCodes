package chapter4;

import java.util.Scanner;

public class ExponentialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        double x = input.nextDouble();

        System.out.print("Enter the number of terms to calculate e^x: ");
        int terms = input.nextInt();
    }
}
