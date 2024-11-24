package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {

    static SecureRandom numbers = new SecureRandom();
    static Scanner input = new Scanner(System.in);

    private static int level = 1;

    public static int generateMultiplication() {
        int digit1 = 0;
        int digit2 = 0;

        if (level == 1) {
            digit1 = 1 + numbers.nextInt(9);
            digit2 = 1 + numbers.nextInt(9);
        }
        else if (level == 2) {
            digit1 = 1 + numbers.nextInt(90);
            digit2 = 1 + numbers.nextInt(90);
        }
        else if (level == 3) {
            digit1 = 1 + numbers.nextInt(900);
            digit2 = 1 + numbers.nextInt(900);
        }

        System.out.printf("How much is %d times %d ?%n", digit1, digit2);
        int product = digit1 * digit2;

        return product;
    }

    public static int generateAddition() {
        int digit1 = 0;
        int digit2 = 0;

        if (level == 1) {
            digit1 = 1 + numbers.nextInt(9);
            digit2 = 1 + numbers.nextInt(9);
        } else if (level == 2) {
            digit1 = 1 + numbers.nextInt(90);
            digit2 = 1 + numbers.nextInt(90);
        } else if (level == 3) {
            digit1 = 1 + numbers.nextInt(900);
            digit2 = 1 + numbers.nextInt(900);
        }

        System.out.printf("How much is %d plus %d ?%n", digit1, digit2);
        int sum = digit1 + digit2;
        return sum;
    }

    public static int generateSubtraction() {
        int digit1 = 0;
        int digit2 = 0;

        if (level == 1) {
            digit1 = 1 + numbers.nextInt(9);
            digit2 = 1 + numbers.nextInt(9);
        } else if (level == 2) {
            digit1 = 1 + numbers.nextInt(90);
            digit2 = 1 + numbers.nextInt(90);
        } else if (level == 3) {
            digit1 = 1 + numbers.nextInt(900);
            digit2 = 1 + numbers.nextInt(900);
        }

        System.out.printf("How much is %d minus %d ?%n", digit1, digit2);
        int sub = digit1 - digit2;
        return sub;
    }

    public static double generateDivision() {
        int digit1 = 0;
        int digit2 = 0;
        double quotient = 0;
        if (level == 1) {
            digit1 = 2 + numbers.nextInt(10);
            digit2 = 2 + numbers.nextInt(10);
        }
        else if (level == 2) {
            digit1 = 1 + numbers.nextInt(90);
            digit2 = 1 + numbers.nextInt(90);
        }
        else if (level == 3) {
            digit1 = 1 + numbers.nextInt(900);
            digit2 = 1 + numbers.nextInt(900);
        }

        if (digit1 > digit2) {
            System.out.printf("What is the quotient of %d divided by %d ?%n", digit1, digit2);
            quotient = (double) digit1 / digit2;
        }
        else if (digit2 > digit1) {
            System.out.printf("What is the quotient of %d divided by %d ?%n", digit2, digit1);
            quotient = (double) digit2 / digit1;
        }

        return quotient;
    }

    public static void main(String[] args) {
        while (true) {
            int correctAnswer = generateMultiplication();

            int userAnswer = input.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Very good!");
            } else {
                System.out.printf("No. Please try again.%nThe correct answer is %d.%n", correctAnswer);
            }
        }
    }
}
