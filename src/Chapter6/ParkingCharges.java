package Chapter6;

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
}
