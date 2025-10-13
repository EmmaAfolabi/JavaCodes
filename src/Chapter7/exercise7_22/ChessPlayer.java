package Chapter7.exercise7_22;

import java.util.Scanner;

public class ChessPlayer {
    ChessBoard k = new ChessBoard();

    public void moveKnight() {

        Scanner input = new Scanner(System.in);

        int counter = 0;
        System.out.println("Move knight around chess board\nEnter moves 0-7");

        while (counter <= 64) {

            int movenumber = input.nextInt();

            k.setPieceMove(movenumber);

            ++counter;
        }
        k.displayVisitedSquares();
        input.close();
    }
}
