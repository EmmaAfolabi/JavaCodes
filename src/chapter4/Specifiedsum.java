package chapter4;

import java.util.Scanner;

public class Specifiedsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int initialnumber;
        int sum = 0;

        System.out.println("Enter a number: ");
        initialnumber = input.nextInt();

        while (sum < initialnumber) {
            System.out.println("Enter a number to add to the sum: ");
            int number = input.nextInt();
            sum += number;

            System.out.printf("Last entered number: %d%nCurrent sum of values: %d%n", number, sum);
        }
        System.out.println("Sum has reached or exceeded the intial number.");
    }
}
