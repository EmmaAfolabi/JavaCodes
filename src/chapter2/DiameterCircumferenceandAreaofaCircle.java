package chapter2;

import java.util.Scanner;

public class DiameterCircumferenceandAreaofaCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kindly enter the radius: ");
        int radius = input.nextInt();

        int diameter = 2*radius;
        System.out.printf("Diameter of the circle is %d%n", diameter);

        int circumference = (int) (2 * Math.PI * radius);
        System.out.printf("Circumference of the circle is %d%n", circumference);

        int area = (int) (Math.PI * radius * radius);
        System.out.printf("Area of the circle is %d%n", area);

    }
}
