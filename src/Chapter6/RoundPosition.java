package Chapter6;

import java.util.Scanner;

public class RoundPosition {

    public static double roundToInteger(double number) {

        double y = Math.floor(number + 0.5);

        return y;
    }
    public static double roundToTenths(double number) {

        double y = Math.floor(number * 10 + 0.5) / 10;

        return y;
    }
    public static double roundToHundredths(double number) {

        double y = Math.floor(number * 100 + 0.5) / 100;

        return y;
    }
    public static double roundToThousandths(double number) {

        double y = Math.floor(number * 1000 + 0.5) / 1000;

        return y;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter value: ");
        double y = input.nextDouble();

        System.out.println("Original value is: " + y);

        System.out.println("value rounded to the nearest integer is: " + roundToInteger(y));

        System.out.println("value rounded to the nearest tenth is: " + roundToTenths(y));

        System.out.println("value rounded to the nearest hundreths is: " + roundToHundredths(y));

        System.out.println();
    }
}
