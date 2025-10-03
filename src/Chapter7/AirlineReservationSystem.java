package Chapter7;

import java.util.InputMismatchException;
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
        return false; // First class full

    }
    public boolean bookEconomy() {
        boolean book;
        for (int seats = 5; seats < 10; seats++) {
            book = airlineSeats[seats];
            if (book == false) {
                System.out.printf("%s%n%s[%02d]%n%s%n%n", "BOARDING PASS", "Seat No is: ", seats + 1, "Section: Economy-class");
                airlineSeats[seats] = true;
                return true;
            }
        }
        return false; // Economy full
    }

    public void assignSeats() throws InputMismatchException {
        int customer = 0;
        boolean check;
        char option = 'Y';

        Status allSeats = availableSeats();
        System.out.println("Welcome to Arik Air!");


            while (allSeats == Status.Yes) {

                System.out.println("Please type 1 for First Class and type 2 for Economy.");
                customer = in.nextInt();
                if (customer == 1) {
                    check = assignFirstClass();
                    if (check == true) {
                        System.out.println("Thank You!\n");
                    }
                    else {
                        System.out.println("First-class section is full\nWould you like to be placed in economy-class ?[Y/N]");

                            option = in.next().charAt(0);

                            if (option == 'Y') {
                                check = bookEconomy();
                                if (check == true) {
                                    System.out.println("Thank you!\n");
                                }
                                else
                                    System.out.println("Next Flight leaves in 3 hours\n");

                            }
                            else {
                                System.out.println("Next Flight leaves in 3 hours\n");
                            }
                    }
                }

                else if (customer == 2) {
                    check = bookEconomy();
                    if (check == true) {
                        System.out.println("Thank You!\n");
                    }
                    else {
                        System.out.println("Economy class is full\nWould you like to be placed in first class ?[Y/N]");

                        option = in.next().charAt(0);


                        if (option == 'Y') {
                            check = assignFirstClass();
                            if (check == true)
                                System.out.println("Thank you!\n");
                            else
                                System.out.println("Next Flight leaves in 3 hours\n");
                        }
                        else {
                            System.out.println("Next Flight leaves in 3 hours\n");
                        }
                    }
                }
                // check if seats are still available
                allSeats = availableSeats();


            }



            if (allSeats == Status.Sold) {
                System.out.println("All seats sold. Next Flight leaves in 3 hours");
            }

    }
    public Status availableSeats() {

        for (boolean flightSeats : airlineSeats) {
            if (flightSeats == false) {
                return Status.Yes;
            }
        }

        return Status.Sold;
    }
}
