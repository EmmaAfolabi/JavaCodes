package Chapter7;
// using variable-length argument lists.

public class VarargsTest {
    // calculate average
    public static double average(double... numbers) {
        double total = 0.0;

        // calculate total using the enhanced for statement
        for (double d : numbers) {
            total += d;
        }

        return total / numbers.length;
    }
}
