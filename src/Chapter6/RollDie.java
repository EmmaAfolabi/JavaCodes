package Chapter6;

import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {
        // randomNumbers object will produce secure random numbers
        SecureRandom randomNumbers = new SecureRandom();

        int frequency1 = 0;  //  count of 1s rolled
        int frequency2 = 0;  //  count of 2s rolled
        int frequency3 = 0;  //  count of 3s rolled
        int frequency4 = 0;  //  count of 4s rolled
        int frequency5 = 0;  //  count of 5s rolled
        int frequency6 = 0;  //  count of 6s rolled

        // tally counts for 60,000,000 rolls of a die
        for (int roll = 1; roll <= 60_000_000; roll++) {
            int face = 1 + randomNumbers.nextInt(6); // number from 1 to 6

            // use face value 1-6 to determine which counter to increment
            switch (face) {
                case 1:
                    ++frequency1;
                    break;
                case 2:
                    ++frequency2;
                    break;
                case 3:
                    ++frequency3;
                    break;
                case 4:
                    ++frequency4;
                    break;
                case 5:
                    ++frequency5;
                    break;
                case 6:
                    ++frequency6;
                    break;
            }
        }
    }
}
