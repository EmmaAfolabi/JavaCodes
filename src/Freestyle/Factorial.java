package Freestyle;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kindly input the number to get the factorial: ");
        int num = input.nextInt();
        int factorial = 1, i = 1;

        while( i <= num) {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d is %d%n", num, factorial);

    }
}
