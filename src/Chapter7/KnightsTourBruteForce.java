package Chapter7;

import java.awt.*;
import java.security.SecureRandom;
import java.util.ArrayList;

public class KnightsTourBruteForce {

    private static final int BOARD_SIZE = 8;
    public static final int SQUARES = BOARD_SIZE * BOARD_SIZE;

    // The possible moves a knight can make
    public static final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    public static final int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

    private static int[][] board;
    private static SecureRandom random = new SecureRandom();

    // Resets the chessboard with the tour path
    private static void displayBoard() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                System.out.printf("%3d", board[row][col]);
            }
            System.out.println();
        }
    }

    // Runs a single random tour of the knight
    public static int runSingleRandomTour() {
        resetBoard();
        int currentRow = random.nextInt(BOARD_SIZE); // Random starting row
        int currentCol = random.nextInt(BOARD_SIZE); // Random starting col
        int moveNumber = 1;
        board[currentRow][currentCol] = moveNumber;

        while (moveNumber < SQUARES) {
            List<Integer> validMoves = new ArrayList<>();

            // Find all valid moves from the current position
            for (int i = 0; i < 8; i++) {
                int nextRow = currentRow + vertical[i];
                int nextCol = currentCol + horizontal[i];

                // Check if the move is within the board and the square is unvisited
                if (nextRow >= 0 && nextRow < BOARD_SIZE &&
                        nextCol >= 0 && nextCol < BOARD_SIZE &&
                        board[nextRow][nextCol] == 0) {
                    validMoves.add(i); // Add the index of the valid move
                }
            }

            if (validMoves.isEmpty()) {
                break; // The Knight is stuck
            }

            // Pick one of the valid moves at random
            int randomMoveIndex = validMoves.get(random.nextInt(validMoves.size()));

            // Update the knight's position
            currentRow += vertical[randomMoveIndex];
            currentCol += horizontal[randomMoveIndex];
            moveNumber++;
            board[currentRow][currentCol] = moveNumber;
        }
        return moveNumber; // This is the total length of the tour
    }

    public static void main(String[] args) {

        System.out.println();
    }
}
