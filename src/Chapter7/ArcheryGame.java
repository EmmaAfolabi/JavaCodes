package Chapter7;

import java.security.SecureRandom;

public class ArcheryGame {
    public static void main(String[] args) {
        final int PLAYERS = 4;
        final int CHANCES = 3;

        SecureRandom random = new SecureRandom();

        // score[p][c] = score of player p at chance c
        int[][] scores = new int[PLAYERS][CHANCES];
        int[] totals = new int[PLAYERS];

        // Fill scores with secure random numbers 0..10 and compute totals
        for (int p = 0; p < PLAYERS; p++) {
            int sum = 0;
            for (int c = 0; c < CHANCES; c++) {
                scores[p][c] = random.nextInt(11); // 0..10 inclusive
                sum += scores[p][c];
            }
            totals[p] = sum;
        }

        // Find winner
    }
}
