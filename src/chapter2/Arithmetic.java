package chapter2;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int number2 = input.nextInt();

        int product = number1 * number1;
        int product2 = number2 * number2;

        System.out.printf("square of product is %d%n", product);
        System.out.printf("square of product2 is %d%n", product2);

        int sum = product + product2;
        System.out.printf("sum of their squares is %d%n", sum);

        int sub = product - product2;
        System.out.printf("differences of their squares is %d%n", sub);
    }
}
