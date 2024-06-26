package chapter3;

import java.util.Scanner;

public class Physics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kindly enter the value of the mass in kg: ");
        double mass = input.nextDouble();

        double acceleration = 9.80;
        System.out.printf("Value of the acceleration is : %.2fms/2%n ", acceleration);

        double force = mass * acceleration;
        System.out.printf("Force is : %.2fN%n ", force);
    }
}
