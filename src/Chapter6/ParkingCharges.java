package Chapter6;

import java.util.Scanner;

public class ParkingCharges {

    // method to calculate charges based on hours parked
    public static double calculateCharges(int hours) {
        double charges = 0.0;

        if (hours >= 1 && hours <= 3) {
            charges = 2.0;
        } else if (hours > 3 && hours <= 24) {
            charges = ((hours - 3 * 0.5)) + 2.0;
            if (charges > 10.0) {
                charges = 10.0;
            }
        }
        return charges;
    }

    // method to calculate the total receipts from multiple customers
    public static double calculateReceipts() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter total number of receipts: ");
        int count = input.nextInt();
        int hours;
        double receiptTotal = 0;

        for (int d = 1; d <= count; d++) {
            System.out.println("Enter hours parked: ");
            hours = input.nextInt();

            double charge = calculateCharges(hours);
            System.out.printf("Customer charge is: %.2f%n", charge);
            receiptTotal += charge;
        }

        input.close();
        return receiptTotal;
    }

    // main method to execute the program
}
