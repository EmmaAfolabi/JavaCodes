package Chapter6;

import java.util.Scanner;

public class Expponentiation {

    // method to calculate the power of a number
    public static int integerPower(int base, int exponent) {
        int power = 1;

        for (int count = 1; count <= exponent; count++) {
            power *= base;
        }

        return power;
    }

    // method to calculate the largest integer less than or equal to num
    public static int myFloor(double num) {
        int floor = (int) num;
        if (num < floor) {
            floor--;
        }
        return floor;
    }

    public static int myCeil(double num) {
        int ceil = (int) num;
        if (num > ceil) {
            ceil++;
        }
        return ceil;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test integerPower method
        System.out.println("Enter base: ");
        int b = in.nextInt();

        System.out.println("Enter exponent: ");
        int e = in.nextInt();

        System.out.printf("%d exponent %d equals %d%n", b, e, integerPower(b, e));

        // Test myFloor and myCeil methods
        System.out.println("Enter a positive double: ");
        double num = in.nextDouble();

        System.out.printf("myFloor(%f) = %d%n", num, myFloor(num));
        System.out.printf("myCeil(%f) = %d%n", num, myCeil(num));
    }
}
