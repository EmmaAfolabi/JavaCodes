package Chapter7;

public class VariableLengthArgumentList {

    // Method that accepts variable-length arguments list
    public static double average(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number is required to calculate average.");
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        // Test calls with different numbers of arguments
        System.out.println("Average of 5, 10, 15: " + average(10, 20, 30));
        System.out.println("Average of 5, 15: " + average(5, 15));
        System.out.println("Average of 7: " + average(7));
    }
}
