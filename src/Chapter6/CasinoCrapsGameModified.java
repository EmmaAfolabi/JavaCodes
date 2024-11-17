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
}
