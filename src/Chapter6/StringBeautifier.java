package Chapter6;

public class StringBeautifier {

    // Method to check if the string ends with a full stop and add one if it doesn't
    public static String ensureFullStop(String input) {
        if (!input.endsWith(".")) {
            return input + ".";
        }
        return input;
    }

    // Method to check if the string starts with a capital letter and capital
}
