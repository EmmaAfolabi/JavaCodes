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

    private int row_moves[] = {0,0,0,1,1,1,2,2,2};
    private int col_moves[] = {0,1,2,0,1,2,0,1,2};

    public Tic_Tac_Toe() {
        for (int i = 0; i < board.length; i++)
            for (int k = 0; k < board[i].length; k++)
                board[i][k] = Type.EMPTY;
    }
}
