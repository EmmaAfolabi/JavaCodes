package Chapter6;

import java.util.Random;
import java.util.Scanner;

public class CoinTossing {

    private enum Coins {HEADS, TAILS};

    public static void tossCoin(int count) {
        Random generic = new Random();
        int heads = 0, tails = 0;
        for (int y = 1; y <=count; y++) {
            int side = generic.nextInt(2);
            if (side == 0) {
                tails++;
            } else {
                heads++;
            }
        }
        System.out.printf("Heads = %d, Tails = %d%nCoin lands on %s!%n", heads, tails, flip());
    }

    public static Coins flip() {
        Random game = new Random();
        int value = game.nextInt(2);
        return (value == 1) ? Coins.HEADS : Coins.TAILS;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.  Toss Coin");
            System.out.println("2.  Exit");
            System.out.print("Choose an option: ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.print("How many times do you want to toss the coin ? ");
                int count = input.nextInt();
                tossCoin(count);
            }
        } while (choice != 2);
        input.close();
    }
}
