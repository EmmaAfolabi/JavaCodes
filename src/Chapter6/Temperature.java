package Chapter6;

import java.util.Scanner;

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
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature type ('k' for kelvin, 'c' for Celsius): ");
        char type = input.next().charAt(0);

        System.out.println("Enter the temperature value: ");
        double temp = input.nextDouble();

        if (type == 'k') {
            System.out.printf("Celsius equivalent is: %.2f~C\n", celsiusFromKelvin(temp));
        } else if (type == 'c') {
            System.out.printf("kelvin temperature is: %.2fk\n", kelvin(temp));
        } else {
            System.out.println("Invalid temperature type.");
        }

        input.close();
    }
}
