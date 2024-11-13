package Chapter6;

import java.util.Scanner;

public class Hypotenuse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two sides of a right angle triangle separated by spaces: ");
        double sideA = in.nextDouble();
        double sideB = in.nextDouble();

        System.out.println("Hypotenuse is: " + hypotenuse(sideA, sideB));
        in.close();
    }

    public static double hypotenuse(double side1, double side2) {
        double hypotenuseSquared = Math.pow(side1, 2) + Math.pow(side2, 2);
        return Math.sqrt(hypotenuseSquared);
    }
}
