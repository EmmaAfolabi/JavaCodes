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
