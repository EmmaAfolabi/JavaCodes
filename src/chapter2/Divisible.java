package chapter2;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter integer: ");
        int number = input.nextInt();

        int remainder = number % 3;
        if (remainder == 0) {
            System.out.printf("Remainder = %d%n", remainder);
        }
        if (remainder > 0){
            System.out.printf("Remainder = %d%n", remainder);
        }
    }
}
