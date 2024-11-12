package Chapter6;

public class RoundPosition {

    public static double roundToInteger(double number) {

        double y = Math.floor(number + 0.5);

        return y;
    }
    public static double roundToTenths(double number) {

        double y = Math.floor(number * 10 + 0.5) / 10;

        return y;
    }
}
