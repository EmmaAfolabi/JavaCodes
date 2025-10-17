package Chapter7.exercise7_28;

import java.util.Random;

public class TortoiseandHareSimulation {

    int[] track = new int[70];

    int tortoise = 1;
    int hare = 1;

    Tortoise akpan = new Tortoise();
    Hare bolt = new Hare();
    Random m = new Random();

    public void simulateRace() {
        int moveNo;

        System.out.printf("BANG !!!!!%nAND THEY'RE OFF !!!!%n");

        while (tortoise < 70 && hare < 70) {
           int tortoiseMoveType = 1 + m.nextInt(10);
           int hareMoveType = 1 + m.nextInt(10);

           tortoise += akpan.move(tortoiseMoveType);
           hare += bolt.move(hareMoveType);

           if (tortoise < 1) {
               tortoise = 1;
           }
           if (hare < 1) {
               hare = 1;
           }

           displayTrack();

           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
        }

        if (tortoise >= 70 && hare >= 70) {
            System.out.println("\nIt's a tie!");
        }
        else if (tortoise >= 70) {
            System.out.println("\nTORTOISE WINS!!! YAY!!!!");
        }
        else if (hare >= 70) {
            System.out.println("\nHare wins. Yuch.");
        }
    }
    public void displayTrack() {

        for (int i = 1; i < 70; i++) {

            if (i == tortoise && i == hare) {
                System.out.print("OUCH!!");
                i += 5;
            }
            else if (i == tortoise)
                System.out.print('T');
            else if (i == hare)
                System.out.print('H');
            else
                System.out.println("_");
        }
        System.out.println();
    }
}
