package Chapter6;

import java.util.Scanner;

public class LeapYear {

    // method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year conditions
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;  // If divisible by 100, check if also divisible by 400
            } else {
                return true;  // Divisible by 4 but not by 100
            }
        } else {
            return false;  // Not divisible by 4
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " " + "is a leap year");
        } else {
            System.out.println(year + " " + "is not a leap year");
        }
    }
}
