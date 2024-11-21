package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessingGame {

    private enum Mode {High,Low,Yes,Default}

    public static void guessingGame() {
        final int MAX_NUMBER = 1000;
        final int MAX_TRIES = 10;  // set the maximum number of trials to 10
        Scanner input = new Scanner(System.in);

        int guess, play = 1, tries = 0;
        int value;
        Mode range = Mode.Default;

        while (play == 1) {
            System.out.printf("Guess a number between 1 - %d:", MAX_NUMBER);
            value = generateNumbers(MAX_NUMBER);

            do {
                guess = input.nextInt();
                tries++;

                if (guess > value) {
                    range = Mode.High;
                    System.out.println("Too High. Try Again");
                } else if (guess < value) {
                    range = Mode.Low;
                    System.out.println("Too Low. Try Again");
                } else {
                    range = Mode.Yes;
                    System.out.printf("Congratulations. You guessed the number!!%n%n");
                    break;
                }

                if (tries > MAX_TRIES) {
                    System.out.println("Sorry, you've exceeded the maximum number of trials. The game will end now.");
                    System.out.printf("The correct number was %d.%n%n", value);
                    break;
                }
                //tries++;
            } while (range != Mode.Yes);

            if (range == Mode.Yes) {
                System.out.printf("You guessed the correct number in %d tries!%n%n", tries);
            } else if (tries > MAX_TRIES) {
                System.out.println("You should be able to do better");
            }

            /* if (tries <= 10) {
                System.out.println("Either you know the secret or you got lucky!\n");
            } else if (tries == 10) {
                System.out.println("Aha! you know the secret! \n");
            } else {
                System.out.println("You should be able to do better\n");
            }

            if (tries > MAX_TRIES) {
                break;
            } */

            tries = 0;
            range = Mode.Default;
            System.out.print("Enter 1 to play again or 0 to exit\n");
            play = input.nextInt();
        }
        System.out.print("Goodbye!!");
        input.close();
    }

    public static int generateNumbers(int maxNumber) {
        SecureRandom digit = new SecureRandom();
        return 1 + digit.nextInt(maxNumber);
    }

    public static void main(String[] args) {
        GuessingGame.guessingGame();
    }
}
