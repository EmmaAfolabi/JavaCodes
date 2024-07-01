package chapter2;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //obtain integers from the users
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        //square of each number
        int sqr = num1 * num1;
        int sqr2 = num2 * num2;

        //prints the square of each integer
        System.out.printf("square of the first integer is %d%n", sqr);
        System.out.printf("square of the second integer is %d%n", sqr2);

        //sum of their squares
        int sum = sqr + sqr2;
        System.out.printf("sum of their squares is %d%n", sum);

        //difference of the squares
        int diff = sqr - sqr2;
        System.out.printf("differences of their squares is %d%n", diff);
    }
}
