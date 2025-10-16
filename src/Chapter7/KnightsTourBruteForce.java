package Chapter7;

import java.security.SecureRandom;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class KnightsTourBruteForce {

    private static final int BOARD_SIZE = 8;
    private static final int SQUARES = BOARD_SIZE * BOARD_SIZE;

    // The possible moves a knight can make
    private static final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

    private static int[][] board;
    private static SecureRandom random = new SecureRandom();

    private static void resetBoard() {
        board = new int[BOARD_SIZE][BOARD_SIZE];
    }

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

                // Check if the move is within the board and the square unvisited
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

    // prints the tour length statistics in a neat table
    private static void printStatistics(int[] lengths, long totalTours) {
        System.out.println("\nTour Length Distribution:");
        System.out.println("Length\t\tCount");
        System.out.println("------\t\t-----");
        for (int i = 1; i < lengths.length; i++) {
            if (lengths[i] > 0) {
                System.out.printf("%-6d\t\t%,d%n", i, lengths[i]);
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("--- A Single Random Tour ---");
        int tourLength = runSingleRandomTour();
        displayBoard();
        System.out.println("\nThe knight got " + tourLength + " moves in.");
        System.out.println("-----------------------------------------\n");


        System.out.println("-- Statistics for 1,000 Tours ---");
        int[] tourLengths = new int[SQUARES + 1]; // Indices 0 -64
        int bestResultB = 0;
        final int TOURS_B = 1000;

        for (int i = 0; i < TOURS_B; i++) {
            int length = runSingleRandomTour();
            tourLengths[length]++;
            if (length > bestResultB) {
                bestResultB = length;
            }
        }
        printStatistics(tourLengths, TOURS_B);
        System.out.println("\nBest result in 1,000 tours: " + bestResultB + " moves.");
        System.out.println("---------------------------------------------\n");

        System.out.println("--- Running Until a Full Tour is Found ----");
        System.out.println("[Caution: This could take a very long time...]");


        // Reset statistics for part c
        tourLengths = new int[SQUARES + 1];
        long totalToursAttempted = 0;
        int currentLength = 0;

        Instant startTime = Instant.now();

        while (currentLength < SQUARES) {
            currentLength = runSingleRandomTour();
            tourLengths[currentLength]++;
            totalToursAttempted++;

            // provide periodic updates to show progress
            if (totalToursAttempted % 5_000_000 == 0) {
                System.out.printf("...%,d tours attempted. Still searching...%n", totalToursAttempted);
            }
        }

        Instant endTime = Instant.now();
        Duration timeElapsed = Duration.between(startTime, endTime);

        System.out.println("\n*** Full Tour Found! ***");
        displayBoard(); // display the board of the successful tour
        System.out.println("\n--- Final Statistics ---");
        printStatistics(tourLengths, totalToursAttempted);

        System.out.printf("%nApplication attempted %,d tours to find a full tour.%n", totalToursAttempted);
        System.out.printf("Time taken: %d minutes and %d seconds.%n", timeElapsed.toMinutes(), timeElapsed.toSecondsPart());
        System.out.println("----------------------------------------------------\n");
    }
}