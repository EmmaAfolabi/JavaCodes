package chapter2;

import java.util.Scanner;

public class ArithmeticSmallestandLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //stores first integer
        System.out.println("Enter first integer: ");
        int num1 = input.nextInt();

        //stores second integer
        System.out.println("Enter second integer: ");
        int num2 = input.nextInt();

        //stores third integer
        System.out.println("Enter third integer: ");
        int num3 = input.nextInt();

        int sum = num1 + num2 + num3;
        System.out.printf("sum of the three integers %d%n", sum);

        int average = (num1 + num2 + num3)/3;
        System.out.printf("average of three integers %d%n", average);

        int product = num1 * num2 * num3;
        System.out.printf("product of three integers %d%n", product);

        if (num1 > num2 && num1 > num3){
            System.out.println("Number1 is the largest");
        }
        if (num1 < num2 && num1 < num3){
            System.out.println("Number1 is the smallest");
        }
        if (num2 > num1 && num2 > num3){
            System.out.println("Number2 is the largest");
        }
        if (num2 < num1 && num2 < num3){
            System.out.println("Number2 is the smallest");
        }
        if (num3 > num1 && num3 > num2){
            System.out.println("Number3 is the largest");
        }
        if (num3 < num1 && num3 < num2){
            System.out.println("Number3 is the smallest");
        }
    }
}
