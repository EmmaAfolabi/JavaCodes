package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GuessingGame {

    private enum Mode {High,Low,Yes,Default}

    public static void guessingGame() {
        final int MAX_NUMBER = 1000;
        final int MAX_TRIES = 10;  // set the maximum number of trials to 10
        final int TOTAL_TIME_LIMIT = 60; // Time limit in seconds
        Scanner input = new Scanner(System.in);

        int guess, play = 1, tries = 0;
        int value;
        Mode range = Mode.Default;

        while (play == 1) {
            System.out.printf("Guess a number between 1 - %d:", MAX_NUMBER);
            value = generateNumbers(MAX_NUMBER);

            // Start the overall timer
            ScheduledExecutorService overallExecutor = Executors.newScheduledThreadPool(1);
            final boolean[] timeUp = {false};
            overallExecutor.schedule(() -> {
                timeUp[0] = true;
                System.out.println("\nTime's up");
            }, TOTAL_TIME_LIMIT, TimeUnit.SECONDS);

            while (!timeUp[0] && range != Mode.Yes) {
                ScheduledExecutorService trialExecutor = Executors.newScheduledThreadPool(1);
                final boolean[] trialTimeUp = {false};
                final int TRIAL_TIME_LIMIT = 10; // Time limit for each trial in seconds

                trialExecutor.schedule(() -> {
                    trialTimeUp[0] = true;
                    System.out.println("Trial time's up! Move faster next time!");
                }, TRIAL_TIME_LIMIT, TimeUnit.SECONDS);

                if (timeUp[0]) {
                    System.out.printf("You've exceeded the total time limit of %d seconds.%n", TOTAL_TIME_LIMIT);
                    break;
                }

                if (input.hasNext()) {
                    guess = input.nextInt();
                    tries++;

                    if (trialTimeUp[0]) {
                        System.out.println("Your trial took too long! Moving to the next trial.");
                        continue;
                    }

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

                }
                trialExecutor.shutdown();
            }

            overallExecutor.shutdown();
                //tries++;
            //} while (range != Mode.Yes);

            if (range == Mode.Yes) {
                System.out.printf("You guessed the correct number in %d tries!%n%n", tries);
            } else if (tries > MAX_TRIES || timeUp[0]) {
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

            // reset and display the timer before making a choice
            long startTime = System.currentTimeMillis();
            play = input.nextInt();
            long endTime = System.currentTimeMillis();
            long duration = (endTime - startTime) / 1000;
            System.out.printf("Time taken to decide: %d seconds%n", duration);
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
