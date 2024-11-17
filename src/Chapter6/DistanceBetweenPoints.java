package Chapter6;

import java.util.Scanner;

public class DistanceBetweenPoints {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates for the first point (x1, y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter coordinates for the second point (x2, y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distance = findDistance(x1, y1, x2, y2);
        System.out.printf("The distance between the points is: %.2f%n", distance);

        scanner.close();
    }
}
