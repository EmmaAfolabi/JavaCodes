package chapter2;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kindly input the number you want to know : ");
        int number = input.nextInt();

        int remainder = number % 3;
        if (remainder == 0) {
            System.out.printf("This number %d is divisible by 3", number);
        }
        if (remainder != 0){
            System.out.printf("This number %d is not divisible by 3", number);
        }
    }
}
