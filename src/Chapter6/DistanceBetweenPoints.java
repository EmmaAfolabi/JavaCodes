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

    public static double findDistance(double x1, double y1, double x2, double y2) {
        double dist = Math.sqrt(calculate_x(x1, x2) + calculate_y(y1, y2));
        return dist;
    }

    public static double calculate_x(double x1, double x2) {
        return Math.pow(x2 - x1, 2);
    }

    public static double calculate_y(double y1, double y2) {
        return Math.pow(y2 - y1, 2);
    }
}
