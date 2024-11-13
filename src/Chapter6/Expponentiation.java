package Chapter6;

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

}
