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

    static Type move;
    static players currentPlayer;

    public Tic_Tac_Toe() {
        for (int i = 0; i < board.length; i++)
            for (int k = 0; k < board[i].length; k++)
                board[i][k] = Type.EMPTY;
    }

    public void play() {

        System.out.println("Select first move: 'X' or 'O'");
        char firstMove = input.next().charAt(0);

        if (firstMove == 'X') {
            move = Type.X;
        }
        else if (firstMove == 'O') {
            move = Type.O;
        }
        else {
            System.out.println("Invalid choice! Defaulting to 'X'");
            move = Type.X;
        }

        int gameCount = 0;
        boolean gameWon = false;

        while (gameCount < 9 && !gameWon) {
            System.out.printf("%s's turn%nEnter move number (0-8): ", move);
            int moveNo = input.nextInt();


            while (!makeMove(moveNo)) {
                System.out.printf("Try again. Enter move number (0-8): ");
                moveNo = input.nextInt();
            }

            displayBoard();

            if (checkWin()) {
                System.out.printf("%s wins!!%n", move);
                gameWon = true;
            }
            else {
                gameCount++;

                if (gameCount == 9) {
                    System.out.println("It's a draw!");
                    break;
                }

                if (move == Type.X) {
                    move = Type.O;
                }
                else {
                    move = Type.X;
                }
            }
        }
    }
}
