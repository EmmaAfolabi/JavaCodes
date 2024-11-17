package Chapter6;

import java.util.Scanner;

public class GuessingGame {

    private enum Mode {High,Low,Yes,Default}

    public static void guessingGame() {
        final int MAX_NUMBER = 1000;
        Scanner input = new Scanner(System.in);

        int guess, play = 1, tries = 0;
        int value;
        Mode range = Mode.Default;
    }
}
