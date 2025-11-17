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


    }
}
