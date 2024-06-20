package chapter2;

import java.util.Scanner;

public class LargestandSmallestIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.println("Enter second integer: ");
        int number2 = input.nextInt();
        System.out.println("Enter third integer: ");
        int number3 = input.nextInt();
        System.out.println("Enter fourth integer: ");
        int number4 = input.nextInt();
        System.out.println("Enter fifth integer: ");
        int number5= input.nextInt();
        if (number1>number2&&number1>number3&&number1>number4&&number1>number5){
            System.out.println("number1 is the largest");
        }
        if (number1<number2&&number1<number3&&number1<number4&&number1<number5){
            System.out.println("number1 is the smallest");
        }
        if (number2>number1&&number2>number3&&number2>number4&&number2>number5){
            System.out.println("number2 is the largest");
        }
        if (number2<number1&&number2<number3&&number2<number4&&number2<number5){
            System.out.println("number2 is the smallest");
        }
        if (number3>number1&&number3>number2&&number3>number4&&number3>number5){
            System.out.println("number3 is the largest");
        }
        if (number3<number1&&number3<number2&&number3<number4&&number3<number5){
            System.out.println("number3 is the smallest");
        }
        if (number4>number1&&number4>number2&&number4>number3&&number4>number5){
            System.out.println("number4 is the largest");
        }
        if (number4<number1&&number4<number2&&number4<number3&&number4<number5) {
            System.out.println("number4 is the smallest");
        }
        if (number5>number1&&number5>number2&&number5>number3&&number5>number4){
            System.out.println("number5 is the largest");
        }
        if (number5<number1&&number5<number2&&number5<number3&&number5<number4){
            System.out.println("number5 is the smallest");
        }
    }
}






