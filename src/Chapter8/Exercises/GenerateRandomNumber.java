package Chapter8.Exercises;

import java.security.SecureRandom;
import java.util.Scanner;

public class GenerateRandomNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        SecureRandom randomNumbers = new SecureRandom();

        System.out.println("Enter the number of random numbers to generate: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            input.close();
        }


        System.out.println("Generating" + number + "random numbers in the range 10-100");
        System.out.println("---------------------------------------");

        for (int i = 1; i <= number; i++) {

            int randomNumber = 10 + randomNumbers.nextInt(91);

            System.out.printf("Number %d: %d%n", i, randomNumber);
        }

        System.out.println("---------------------------------------");

        input.close();
    }
}
