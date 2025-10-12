package Chapter7.exercise7_22;

public class ChessBoard {

    int[][] chess = new int[8][8];
    int currentRow = 0, currentColumn = 0;

    public void setPieceMove(int moveNumber) {

        KnightPiece pope = new KnightPiece();
        try {

            if (moveNumber < 8 && moveNumber >= 0) {

                currentRow += pope.getVerticalMove(moveNumber);
                currentColumn +=  pope.getHorizontalMove(moveNumber);
            }

            if (chess[currentRow][currentColumn] == 1) {
                System.out.println("Square already visited");
            }
            else
                chess[currentRow][currentColumn] = 1;
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Move");
        }
        System.out.printf("Knight current position is: (%d, %d)%n", currentRow, currentColumn);
    }
    public void displayVisitedSquares() {
        System.out.printf("%n%17s%n", "ChessBoard");
        for (int row = 0; row < chess.length; row++) {

            for (int col = 0; col < chess[row].length; col++) {

                if (chess[row][col] == 1)
                    System.out.printf(" k ");
                else {
                    System.out.print(" * ");

                }
            }
            System.out.println();
        }
    }
}
