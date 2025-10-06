package Chapter7;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

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

        // Find max total and collect winners (handle ties)
        int maxTotal = -1;
        for (int t : totals) maxTotal = Math.max(maxTotal, t);
        List<Integer> winners = new ArrayList<>();
        for (int p = 0; p < PLAYERS; p++) {
            if (totals[p] == maxTotal) winners.add(p + 1); // player numbers are 1-based
        }

        // Print table
        System.out.println("Archery Scores");
        System.out.println("---------------------------------------");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%n",
                "Player", "Chance1", "Chance2", "Chance3", "Total");
        System.out.println("---------------------------------------");
        for (int p = 0; p < PLAYERS; p++) {
            System.out.printf("%-10d%-10d%-10d%-10d%-10d%n",
                    (p + 1), scores[p][0], scores[p][1], scores[p][2], totals[p]);
        }
        System.out.println("---------------------------------------");

        // Announce winner(s)
        if (winners.size() == 1) {
            System.out.printf("Winner: Player %d with %d points.%n", winners.get(0), maxTotal);
        } else {
            System.out.printf("Tie! Winners: Players %s with %d points.%n", winners, maxTotal);
        }
    }
}
