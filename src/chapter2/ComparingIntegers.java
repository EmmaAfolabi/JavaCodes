package chapter2;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly Input the integer you want to compare: ");
        int num = input.nextInt();
        int squarenum = num * num;

        if(num > 100){
            System.out.println("Number taken is greater than 100");
        }
        if(squarenum > 100){
            System.out.println("squareNumber is greater than 100");
        }
        if(num == 100){
            System.out.println("number is equal to 100");
        }
        if(squarenum == 100){
            System.out.println("squareNumber is equal to 100");
        }
        if(num != 100){
            System.out.println("number is not equal to 100");
        }
        if(squarenum != 100){
            System.out.println("squareNumber is not equal to 100");
        }
        if(num < 100){
            System.out.println("number taken is less than 100");
        }
        if(squarenum < 100){
            System.out.println("squareNumber taken is less than 100");
        }
    }
}
