package Chapter6;

import java.util.Scanner;

public class GuessingGame {

    private enum Mode {High,Low,Yes,Default}

    public static void guessingGame() {
        final int MAX_NUMBER = 1000;
        Scanner input = new Scanner(System.in);

        int guess, play = 1, tries = 0;
        int value;
        Mode range = Mode.Default;

        while (play == 1) {
            System.out.println("Guess a number between 1 -" + MAX_NUMBER);
            value = generateNumbers(MAX_NUMBER);

            do {
                guess = input.nextInt();

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
                tries++;
            } while (range != Mode.Yes);

            if (tries <= 10) {
                System.out.println("Either you know the secret or you got lucky!\n");
            } else if (tries == 10) {
                System.out.println("Aha! you know the secret! \n");
            } else {
                System.out.println("You should eb able to do better\n");
            }

            tries = 0;
            range = Mode.Default;
            System.out.print("Enter 1 to play again or 0 to exit\n");
            play = input.nextInt();
        }
        System.out.print("Goodbye!!");
        input.close();
    }
}
