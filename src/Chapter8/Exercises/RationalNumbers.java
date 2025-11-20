package Chapter8.Exercises;

public class RationalNumbers {

    private int numerator;
    private int denominator;

    public RationalNumbers(int a, int b) {


        try {
            int gcd = findGCD(a, b);
            numerator = a / gcd;
            denominator = b / gcd;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic exception error: "+e.getMessage());
        }


    }
}
