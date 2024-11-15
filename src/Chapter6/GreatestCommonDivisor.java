package Chapter6;

public class GreatestCommonDivisor {

    // Calculates and returns the greatest common divisor between two numbers using Euclidean algorithm
    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
