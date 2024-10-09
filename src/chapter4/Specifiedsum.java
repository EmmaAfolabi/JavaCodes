package chapter4;

import java.util.Scanner;

public class Specifiedsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int intialnumber = 0;
        int sum = 0;

        System.out.println("Enter a number: ");
        intialnumber = input.nextInt();

        while ( sum >= intialnumber) {
            sum += intialnumber;

        }
    }
}
