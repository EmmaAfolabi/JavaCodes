package Chapter8.Exercises;

import java.security.SecureRandom;
import java.util.Scanner;

public class Tic_Tac_Toe {
    private static enum Type{X,O,EMPTY};
    private static enum players{human, computer}

    private int currentRow;
    private int currentColumn;
    Scanner input = new Scanner(System.in);
    SecureRandom random = new SecureRandom();
    private Type[][] board = new Type[3][3];
}
