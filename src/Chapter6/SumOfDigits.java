package Chapter6;

public class SumOfDigits {

    // Method to calculate the sum of the digits of a four-digit number
    public static int sumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
        }

        return sum;
    }
}
