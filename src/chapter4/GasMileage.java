package chapter4;

import java.util.Scanner;

public class GasMileage {

        private double milesDriven;
        private double gallonsUsed;
        private int totalMilesPerGallons;
        int tripCounter = 0;

        public double calculateMilesPerGallons() {
            double milesPerGallons;
            Scanner input = new Scanner(System.in);

            System.out.println("Enter 1 to record miles driven and gallons used for each trips and 0 to end: ");
            int trips = input.nextInt();

            int newTrips = 1;

            while (trips != 0) {

                System.out.println("Enter miles driven: ");
                milesDriven = input.nextDouble();

                System.out.println("Enter gallons Used: ");
                gallonsUsed = input.nextDouble();

                milesPerGallons = milesDriven / gallonsUsed;
                System.out.printf("Mile per gallons for trip %d is: %.2f liters%n%n", newTrips, milesPerGallons);

                totalMilesPerGallons += milesPerGallons;
                newTrips++;

                System.out.println("Enter 1 to continue and 0 to end: ");
                trips = input.nextInt();
            }
            this.tripCounter = newTrips;
            return totalMilesPerGallons;
        }

    public static void main(String[] args) {

            GasMileage Driver1 = new GasMileage();

        System.out.printf("%nTotal miles per gallons for all trips is %.2f liters%n", Driver1.calculateMilesPerGallons());
    }

}




