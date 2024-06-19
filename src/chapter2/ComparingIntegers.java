package chapter2;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly Input the number");
        int number = input.nextInt();
        int squareNumber = number * number;

        if(number > 100){
            System.out.println("Number taken is greater than 100");
        }
        if(squareNumber > 100){
            System.out.println("squareNumber is greater than 100");
        }
        if(number == 100){
            System.out.println("number is equal to 100");
        }
        if(squareNumber == 100){
            System.out.println("squareNumber is equal to 100");
        }
        if(number != 100){
            System.out.println("number is not equal to 100");
        }
        if(squareNumber != 100){
            System.out.println("squareNumber is not equal to 100");
        }
        if(number < 100){
            System.out.println("number taken is less than 100");
        }
        if(squareNumber < 100){
            System.out.println("squareNumber taken is less than 100");
        }
    }
}
