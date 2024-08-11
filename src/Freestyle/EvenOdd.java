package Freestyle;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer to check whether it is odd or even: ");
        int num = input.nextInt();

        if (num %2 == 0 ){
            System.out.println(num + "is even.");
        }
        else {
            System.out.println(num + "is Odd.");
        }
    }
}
