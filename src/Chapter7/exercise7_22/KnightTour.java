package Chapter7.exercise7_22;

public class KnightTour {

    private int[][] accessibility = {
            {2,3,4,4,4,4,3,2},{3,4,6,6,6,6,4,3},
            {4,6,8,8,8,8,6,4},{4,6,8,8,8,8,6,4},
            {4,6,8,8,8,8,6,4},{4,6,8,8,8,8,6,4},
            {3,4,6,6,6,6,4,3},{2,3,4,4,4,4,3,2}
    };

    KnightPiece k = new KnightPiece();
    int tempCol, tempRow, currentRow, currentCol;
    int moveR, moveC;
    int[][] order = new int[8][8];
    int step = 0;

    public void tourKnight() {
        for (int r = 0; r < 8; r++) java.util.Arrays.fill(order[r], 0);
        step = 1;
        order[currentRow][currentCol] = step;
        accessibility[currentRow][currentCol] = 0;

        System.out.printf("Knight start position is: (%d, %d)%n", currentRow, currentCol);

        for (; step < 64; step++) {
            int leastAccess = Integer.MAX_VALUE;
            int bestR = -1, bestC = -1;

            for (int m = 0; m < 8; m++) {
                tempRow = currentRow + k.getVerticalMove(m);
                tempCol = currentCol + k.getHorizontalMove(m);

                if (validateMove(tempRow, tempCol)) {
                    int access = accessibility[tempRow][tempCol];
                    if (access < leastAccess) {
                        leastAccess = access;
                        bestR = tempRow;
                        bestC = tempCol;
                    }
                }
            }

            if (bestR == -1) break; // dead end: no valid moves

            // Commit the move
            currentRow = bestR;
            currentCol = bestC;
            order[currentRow][currentCol] = step + 1;
            accessibility[currentRow][currentCol] = 0;

            // Decrement neighbours of the square we actually moved to
            decrementNeighbours(currentRow, currentCol);
        }
    }

    public void displayChessBoard() {
        System.out.printf("%n%17s%n", "ChessBoard");
        for (int row = 0; row < accessibility.length; row++) {
            for (int col = 0; col < accessibility[row].length; col++) {
                int v = order[row][col];
                System.out.printf("%2d ", v);
            }
            System.out.println();
        }
    }

    public boolean validateMove(int row, int col) {
        if (row >= 0 && row <= 7 && col >= 0 && col <= 7) {
            // Use the visited board to block revisits
            if (order[row][col] == 0) {
                return true;
            }
        }
        return false;
    }

    public void decrementNeighbours(int row, int col) {
        for (int m = 0; m < 8; m++) {
            int nr = row + k.getVerticalMove(m);
            int nc = col + k.getHorizontalMove(m);
            if (nr >= 0 && nr < 8 && nc >= 0 && nc < 8 && accessibility[nr][nc] > 0){
                --accessibility[nr][nc];
            }
        }
    }

    public void tourAll() {
        for (int row = 0; row < accessibility.length; row++) {
            for (int column = 0; column < accessibility[row].length; column++) {
                accessibility = new int[][]{
                        {2,3,4,4,4,4,3,2},{3,4,6,6,6,6,4,3},
                        {4,6,8,8,8,8,6,4},{4,6,8,8,8,8,6,4},
                        {4,6,8,8,8,8,6,4},{4,6,8,8,8,8,6,4},
                        {3,4,6,6,6,6,4,3},{2,3,4,4,4,4,3,2}
                };

                currentRow = row;
                currentCol = column;

                tourKnight();
            }
        }
    }
}
