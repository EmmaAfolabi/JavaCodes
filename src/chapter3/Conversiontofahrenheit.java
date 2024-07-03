package chapter3;

import java.util.Scanner;

public class Conversiontofahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("kindly input the degree in celcius: ");
        int celcius = input.nextInt();
        double fahrenheit = ((double) (celcius * 9) /5) + 32;
        System.out.printf("degree in fahrenheit is:%.1fC%n ", fahrenheit);

        System.out.println("kindly input the degree in fahrenheit: ");
        int fahren = input.nextInt();
        double cel = ((double) (fahren - 32) *5/9);
        System.out.printf("degree in celcius is: %.1fF%n", cel);

    }
}
