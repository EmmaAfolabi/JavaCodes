package chapter4;

import java.util.Scanner;

public class Rightangledtriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int baselength;

        do {
            System.out.print("Enter the base length of the triangle (1 to 10): ");
            baselength = input.nextInt();

            if (baselength < 1 || baselength > 10) {
                System.out.println("Invalid input! Please enter a number between 1 and 10.");
            }
        }while (baselength < 1 || baselength > 10);

        for (int i = 1; i <= baselength; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
