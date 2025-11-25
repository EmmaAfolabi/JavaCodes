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

    public void playWithComputer() {
        System.out.printf("Would you like to go first [Y/N] ?%n");
        char answer = input.next().charAt(0);

        if (answer == 'Y' || answer == 'Y') {
            currentPlayer = players.human;
        }
        else {
            currentPlayer == players.computer;
        }

        int firstMove = 1 + random.nextInt(2);

        if (firstMove == 1) {
            move = Type.X;
            if (currentPlayer == players.human)
                System.out.printf("Human is 'X'%n");
            else
                System.out.printf("Computer is 'X'%n");
        }
        else {
            move = Type.O;
            if (currentPlayer == players.human)
                System.out.printf("Human is 'O'%n");
            else
                System.out.printf("Computer is 'O'%n");
        }

        int gameCount = 0;
        int moveNo;
        boolean gameWon = false;

        while (gameCount < 9 && !gameWon) {
            if (currentPlayer == players.human) {
                System.out.printf("Your Turn%nEnter move number (0-8): ");
                moveNo = input.nextInt();

                while (!makeMove(moveNo)) {
                    System.out.printf("Try again. Enter move number (0-8): ");
                    moveNo = input.nextInt();
                }
            }
            else {
                do {
                    moveNo = random.nextInt(9);
                } while (board[row_moves[moveNo]][col_moves[moveNo]] != Type.EMPTY);

                System.out.printf("Computer moves: %d%n", moveNo);
                makeMove(moveNo);
            }

            displayBoard();

            if (checkWin()) {
                if (currentPlayer == players.human) {
                    System.out.printf("Human wins!!%n");
                }
                else {
                    System.out.println("Computer wins!");
                }
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

                if (currentPlayer == players.human) {
                    currentPlayer = players.computer;
                }
                else {
                    currentPlayer = players.human;
                }
            }
        }
    }

    public boolean makeMove(int MoveNo) {

        if (moveNo < 0 || moveNo > 8) {
            System.out.println("Invalid move number! Must be 0-8");
            return false;
        }

        if (board[row_moves[moveNo]][col_moves[moveNo]] == Type.EMPTY) {
            board[row_moves[moveNo]][col_moves[moveNo]] = move;
            currentRow = row_moves[moveNo];
            currentColumn = col_moves[moveNo];
            return true;
        }
        else
            System.out.println("You can't move to an occupied square");
        return false;
    }

    public void displayBoard() {
        for (Type value[]: board) {
            for (Type box: value) {
                if (box == Type.X)
                    System.out.print(" X ");
                else if (box == Type.O)
                    System.out.print(" O ");
                else if (box == Type.EMPTY)
                    System.out.println(" * ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean checkWin() {

        for (int row = 0; row < 3; row++) {
            if (board[row][0] == move && board[row][1] == move && board[row][2] == move)
                return true;
        }

        for (int col = 0; col < 3; col++) {
            if (board[0][col] == move && board[1][col] == move && board[2][col] == move)
                return true;
        }

        if (board[0][0] == move && board[1][1] = move && board[2][2] == move)
            return true;

        if (board[0][2] == move && board[1][1] == move && board [2][0] == move)
            return true;

        return false;
    }

    private boolean checkMoves(int row, int col) {
        if ()
    }
}
