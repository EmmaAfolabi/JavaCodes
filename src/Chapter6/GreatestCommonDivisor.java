package Chapter6;

import java.util.Scanner;

public class GreatestCommonDivisor {

    // Calculates and returns the greatest common divisor between two numbers using Euclidean algorithm
    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int gcd = findGCD(num1, num2);
        System.out.printf("GCD(%d, %d) = %d%n", num1, num2, gcd);

        input.close();
    }
}
