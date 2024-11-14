package Chapter6;

public class Temperature {

    // Method kelvin returns the kelvin equivalent of a celcius temperature
    public static double kelvin(double celsius) {
        return celsius + 273.15;
    }

    // Method Celcius returns the Celcius equivalent of a kelvin temperature
    public static double celsiusFromKelvin(double kelvin) {
        return kelvin - 273.15;
    }

    public static void main(String[] args) {

    }
}
