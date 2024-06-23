package chapter2;

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("kindly enter the radius : ");
        int radius = input.nextInt();

        System.out.println("kindly enter the height : ");
        int height = input.nextInt();

        int volume = (int) (Math.PI) * radius * radius * height;
        System.out.printf("Volume of the cylinder is %d%n", volume);

        int CSA = 2 * (int) (Math.PI) * radius * height;
        System.out.printf("Curved surface area of the cylinder is %d%n ",CSA);

        int TSA = 2 * (int) (Math.PI) * radius * (height + radius);
        System.out.printf("Total surface area of the cylinder is %d%n", TSA);

    }
}
