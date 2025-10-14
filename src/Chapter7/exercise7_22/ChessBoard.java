package Chapter7.exercise7_22;

public class ChessBoard {

    public static final KnightPiece kMoves = new KnightPiece();

    int[][] chess = new int[8][8];
    int currentRow = 0, currentColumn = 0;
    int moveCounter = 1;

    public ChessBoard() {
        chess[currentRow][currentColumn] = moveCounter; // mark starting square as 1
    }

    public void setPieceMove(int moveNumber) {
        if (moveNumber < 0 || moveNumber >= 8) {
                System.out.println("Invalid move index (must be 0-7)");
                return;
        }

        int nr = currentRow + kMoves.getVerticalMove(moveNumber);
        int nc =  currentColumn + kMoves.getHorizontalMove(moveNumber);

        if (nr < 0 || nr > 7 || nc < 0 || nc > 7) {
            System.out.println("Invalid Move (off board)");
            System.out.printf("Knight current position is: (%d, %d)%n", currentRow, currentColumn);
            return;
        }

        if (chess[nr][nc] != 0) {
            System.out.println("Square already visited");
            System.out.printf("Knight current position is: (%d, %d)%n", currentRow, currentColumn);
            return;
        }

        currentRow = nr;
        currentColumn = nc;
        chess[currentRow][currentColumn] = ++moveCounter;
        System.out.printf("Knight current position is: (%d, %d)%n", currentRow, currentColumn);
    }

    public void displayVisitedSquares() {
        System.out.printf("%n%17s%n", "ChessBoard");
        for (int row = 0; row < chess.length; row++) {

            for (int col = 0; col < chess[row].length; col++) {

                if (chess[row][col] == 0)
                    System.out.print(" . ");
                else {
                    System.out.printf("%2d ", chess[row][col]);
                }
            }
            System.out.println();
        }
    }
}
