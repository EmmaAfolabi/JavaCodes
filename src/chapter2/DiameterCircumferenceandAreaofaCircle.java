package chapter2;

import java.util.Scanner;

public class DiameterCircumferenceandAreaofaCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kindly the radius of the circle: ");
        int radius;
        radius = input.nextInt();

        System.out.printf("Diameter of the circle of radius %d is %d%n", radius, 2*radius);

        System.out.printf("Circumference of the circle is %f%n", (2 * Math.PI * radius));

        System.out.printf("Area of the circle of radius %d is %f%n", radius, (Math.PI * radius * radius));

    }
}
