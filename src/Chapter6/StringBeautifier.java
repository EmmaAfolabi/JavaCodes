package Chapter6;

import java.util.Scanner;

public class StringBeautifier {

    // Method to check if the string ends with a full stop and add one if it doesn't
    public static String ensureFullStop(String input) {
        if (!input.endsWith(".")) {
            return input + ".";
        }
        return input;
    }

    // Method to check if the string starts with a capital letter and capitalize it if it doesn't
    public static String capitalizeFirstLetter(String input) {
        if (input.length() > 0 && Character.isLowerCase(input.charAt(0))) {
            return Character.toUpperCase(input.charAt(0)) + input.substring(1);
        }
        return input;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
    }
}
