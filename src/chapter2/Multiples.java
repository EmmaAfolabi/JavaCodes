package chapter2;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("kindly enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("kindly enter the second number: ");
        int num2 = input.nextInt();

       int tripled = num1*num1*num1;
       int doubled = num2*num2;

       int multiple = tripled % doubled;
       if (multiple ==0){
           System.out.printf("This number %d when doubled is %d, is a multiple of first number %d, which when tripled, is %d", num2, doubled, num1, tripled);
       }
       if (multiple != 0){
           System.out.printf("This number %d when doubled is %d, is not a multiple of the first number %d, which when tripled is %d", num2, doubled, num1, tripled);
       }
    }
}
