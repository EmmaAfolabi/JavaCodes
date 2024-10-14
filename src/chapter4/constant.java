package chapter4;

import java.util.Scanner;

public class constant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of terms to calculate e: ");
        int terms = input.nextInt();

        if (terms < 0) {
            System.out.println("Error: The number of terms must be non-negative.");
        } else {
            double e = 1.0;
            long factorial = 1;

            for (int i = 1; i < terms; i++) {
                factorial *= i;
                e += 1.0 / factorial;
            }


        }
    }
}
