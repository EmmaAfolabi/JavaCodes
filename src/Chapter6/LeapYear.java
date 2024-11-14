package Chapter6;

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
}
