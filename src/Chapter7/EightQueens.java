package Chapter7;

public class EightQueens {

    private static final int BOARD_SIZE = 8;
    private int[][] board; // Represents the chessboard. 0 = empty, 1 = queen, -1 = attacked
    private int[][] eliminationBoard; // Stores the pre-calculated elimination numbers

    public EightQueens() {
        board = new int[BOARD_SIZE][BOARD_SIZE];
        eliminationBoard = new int[BOARD_SIZE][BOARD_SIZE];
        calculateEliminationNumbers();
    }

    // Pre-calculates the elimination number for every square on an empty board
    private void calculateEliminationNumbers() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                eliminationBoard[row][col] = countAttackedSquares(row, col);
            }
        }
    }

    // Counts how many squares are attacked from a given (row, col) position
    private int countAttackedSquares(int row, int col) {
        int count = 0;
        // Horizontal and Vertical (minus the square itself)
        count += (BOARD_SIZE -1) * 2;

        // Diagonals
        count += Math.min(row, col); // Up-left
        count += Math.min(row, BOARD_SIZE - 1 - col); // Up-Right
        count += Math.min(BOARD_SIZE - 1 - row, col); // Down-Left
        count += Math.min(BOARD_SIZE - 1 - row, BOARD_SIZE - 1 - col); // Down-Right

        return count;
    }

    // Main method solving the puzzle using heuristic.
    public void solve() {
        for (int queenCount = 1; queenCount <= BOARD_SIZE; queenCount++) {
            int bestRow = -1;
            int bestCol = -1;
            int minElimination = Integer.MAX_VALUE;

            // Find the best available square with the smallest elimination number
            for (int row = 0; row < BOARD_SIZE; row++) {
                for (int col = 0; col < BOARD_SIZE; col++) {
                    // check if the square is available (not occupied or attacked)
                    if (board[row][col] == 0) {
                        if (eliminationBoard[row][col] < minElimination) {
                            minElimination = eliminationBoard[row][col];
                            bestRow = row;
                            bestCol = col;
                        }
                    }
                }
            }

            // If we found a valid spot, place the queen and update the board
            if (bestRow != -1) {
                placeQueenAndUpdate(bestRow, bestCol, queenCount);
            } else {
                System.out.println("Heuristic failed. Could not place queen #" + queenCount);
                displayBoard();
                return; // Stop if we get stuck
            }
        }

        System.out.println("Heuristic successful! All 8 queens placed");
        displayBoard();
    }

    // Places a queen and mark all attacked squares as unavailable (-1)
    private void placeQueenAndUpdate(int row, int col, int queenNumber) {
        board[row][col] = queenNumber; // Use queen number for clarity, or just 1

        // Mark horizontal and vertical
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[row][i] == 0) board[row][i] = -1;
            if (board[i][col] == 0) board[i][col] = -1;
        }

        // Mark diagonals
        for (int i = 1; i < BOARD_SIZE; i++) {
            // Up-Left
            if (row - i >= 0 && col - i >= 0 && board[row - i][col - i] == 0) board[row - i][col - i] = -1;
            // Up-Right
            if (row - i >= 0 && col + i < BOARD_SIZE && board[row - i][col + i] == 0) board[row - i][col + i] = -1;
            // Down-left
            if (row + i < BOARD_SIZE && col - i >= 0 && board[row + i][col - i] == 0) board[row + i][col - i] = -1;
            // Down-Right
            if (row + i < BOARD_SIZE && col + i < BOARD_SIZE && board[row + i][col + i] == 0) board[row + i][col +i] = -1;
        }
    }

    // Displays the board. 'Q' for queen, '*' for empty/attacked

    public void displayBoard() {
        System.out.println("\n--- Chess Board ---");
        for (int[] row : board) {
            for (int square : row) {
                if (square > 0) {
                    System.out.print(" Q ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        EightQueens game = new EightQueens();
        game.solve();
    }
}
