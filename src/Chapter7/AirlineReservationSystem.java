package Chapter7;

import java.util.Random;
import java.util.Scanner;

public class AirlineReservationSystem {

    static boolean [] airlineSeats =  new boolean[10];
    static Scanner in = new Scanner(System.in);


    private enum Status {Sold, Yes};

    public boolean assignFirstClass() {
        boolean book;

        for (int seats = 0; seats < 5; seats++) {

            book = airlineSeats[seats];
            if (book == false) {
                System.out.printf("%s%n%s[%02d]%n%s%n%n", "BOARDING PASS", "Seat No is: ", seats + 1, "Section: First-Class");
                airlineSeats[seats] = true;
                return true;
            }

        }
        return false;

    }
    public boolean bookEconomy() {

    }
}
