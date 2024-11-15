package Chapter6;

import java.util.Scanner;

public class SumOfDigits {

    // Method to calculate the sum of the digits of a four-digit number
    public static int sumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10;   // Get last digit and add it to sum
            number /= 10;        // Remove the last digit
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a four-digit number:");
        int number = scanner.nextInt();

        // Ensure the number is a four-digit number
        if (number >= 1000 && number <= 9999) {
            int result = sumOfDigits(number);
            System.out.printf("The sum of the digits is: %d%n", result);
        } else {
            System.out.println("Please enter a valid four-digit number.");
        }

        scanner.close();
    }
}
