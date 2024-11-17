package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class CasinoCrapsGameModified {
    // create secure random number generator for use in method rollDice
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);

    // enum type constants that represents the game status
    private enum Status {CONTINUE, WON, LOST}

    // constants that represents the common roles of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    // initial bank balance
    private static int bankBalance = 1000;

    public static void main(String[] args) {
        while (bankBalance > 0) {
            System.out.printf("Your current bank balance is: $%d%n", bankBalance);
            System.out.println("Enter your wager: ");
            int wager = input.nextInt();

            // validate wager
            while (wager > bankBalance || wager <= 0) {
                System.out.print("Invalid wager. Enter a valid wager:");
                wager = input.nextInt();
            }

            Status gameStatus = playCraps();

            // update bank balance based on game outcome
            if (gameStatus == Status.WON) {
                bankBalance += wager;
                System.out.printf("Player wins! New bank balance is $%d%n", bankBalance);
                displayChatter();
            } else {
                bankBalance -= wager;
                System.out.printf("Player loses. New bank balance is $%d%n", bankBalance);
                displayChatter();
                if (bankBalance == 0) {
                    System.out.println("Sorry. You busted!");
                }
            }
        }
    }

    // plays one game of craps and returns the game status
    public static Status playCraps() {
        int myPoint = 0;
        Status gameStatus;

        int sumOfDice = rollDice();

        // determine game status and point based on first roll
        switch (sumOfDice) {
            case SEVEN:  // win with 7 on first roll
            case YO_LEVEN:  // win with 11 on first roll
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:  // lose with 2 on first roll
            case TREY:  // lose with 3 on first roll
            case BOX_CARS:  // lose with 12 on first roll
                gameStatus = Status.LOST;
                break;
            default: // did not win or lose, so remember point
                gameStatus = Status.CONTINUE;  // game is not over
                myPoint = sumOfDice;  // remember the point
                System.out.printf("Point is %d%n", myPoint);
                break;
        }

        // while game is not complete
        while (gameStatus == Status.CONTINUE) {  // not WON or LOST
            sumOfDice = rollDice();  // roll dice again

            // determine game status
            if (sumOfDice == myPoint) {  // win by making point
                gameStatus = Status.WON;
            } else if (sumOfDice == SEVEN) {  // lose by rolling 7 before point
                gameStatus = Status.LOST;
            }
        }
        return gameStatus;
    }

    // roll dice, calculate sum and display results
    public static int rollDice() {
        // pick random die values
        int die1 = 1 + randomNumbers.nextInt(6);  // first die roll
        int die2 = 1 + randomNumbers.nextInt(6);  // second die roll

        int sum = die1 + die2;  // sum of die values

        // display results of this roll
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

        return sum;
    }

    // display random chatter
    public static void displayChatter() {
        int randomMessage = randomNumbers.nextInt(4);
        switch (randomMessage) {
            case 0:
                System.out.println("OH, you're going broke, huh?\n");
                break;
            case 1:
                System.out.println("Aw c'mon, take a chance!\n");
                break;
            case 2:
                System.out.printf("You're up big. Now's the time to cash in your chips!\n");
                break;
            case 3:
                System.out.printf("Feeling lucky? keep it going!\n");
                break;
            default:
                break;
        }
    }
}
