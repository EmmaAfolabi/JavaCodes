package chapter2;

import java.util.Scanner;

public class ArithmeticSmallestandLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.println("Enter second integer: ");
        int number2 = input.nextInt();

        System.out.println("Enter third integer: ");
        int number3 = input.nextInt();

        int sum = number1 + number2 + number3;
        System.out.printf("sum of the three integers %d%n", sum);

        int average = (number1 + number2 + number3)/3;
        System.out.printf("average of three integers %d%n", average);

        int product = number1 * number2 * number3;
        System.out.printf("product of three integers %d%n", product);

        if (number1 > number2 && number1 > number3){
            System.out.println("Number1 is the largest");
        }
        if (number1 < number2 && number1 < number3){
            System.out.println("Number1 is the smallest");
        }
        if (number2 > number1 && number2 > number3){
            System.out.println("Number2 is the largest");
        }
        if (number2 < number1 && number2 < number3){
            System.out.println("Number2 is the smallest");
        }
        if (number3 > number1 && number3 > number2){
            System.out.println("Number3 is the largest");
        }
        if (number3 < number1 && number3 < number2){
            System.out.println("Number3 is the smallest");
        }
    }
}
