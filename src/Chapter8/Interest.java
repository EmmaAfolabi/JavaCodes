package Chapter8;
// Compound-Interest calculations with BigDecimal
import java.math.BigDecimal;

public class Interest {
    public static void main(String[] args) {
        // initial principal amount before interest
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05); // interest rate

        // display headers
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        // calculate amount on deposit for each of ten years
        for (int year = 1; year <= 10; year++) {
            // calculate new amount for specified year
            BigDecimal amount =
                    principal.multiply(rate.add(BigDecimal.ONE).pow(year));
        }
    }
}
