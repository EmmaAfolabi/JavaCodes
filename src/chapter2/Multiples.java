package chapter2;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("kindly enter the first number: ");
        int number1 = input.nextInt();

        System.out.println("kindly enter the second number: ");
        int number2 = input.nextInt();

       int cube = number1*number1*number1;
       int square = number2*number2;

       int multiple = cube % square;
       if (multiple ==0){
           System.out.printf("This number %d when doubled is %d, is a multiple of first number %d, which when tripled, is %d", number2, square, number1, cube);
       }
       if (multiple != 0){
           System.out.printf("This number %d when doubled is %d, is not a multiple of the first number %d, which when tripled is %d", number2, square, number1, cube);
       }
    }
}
