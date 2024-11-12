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
    public static double roundToHundredths(double number) {

        double y = Math.floor(number * 100 + 0.5) / 100;

        return y;
    }
    public static double roundToThousandths(double number) {

        double y = Math.floor(number * 1000 + 0.5) / 1000;

        return y;
    }
}
