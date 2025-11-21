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

    public RationalNumbers() {
        this(8, 8);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public static RationalNumbers addFractions(RationalNumbers object1, RationalNumbers object2) {

        int deno = object1.getDenominator();
        int deno1 = object2.getDenominator();

        int num = object1.getNumerator();
        int num1 = object2.getNumerator();

        int lcm = findLCM(deno, deno1);

        deno /= lcm; deno1 /= lcm;

        num *= deno; num1 *= deno1;

        num = num + num1;

        return new RationalNumbers(num, lcm);

    }

    public static RationalNumbers subFractions(RationalNumbers object1, RationalNumbers object2) {

        int deno = object1.getDenominator();
        int deno1 = object2.getDenominator();

        int num = object1.getNumerator();
        int num1 = object2.getNumerator();

        int lcm = findLCM(deno, deno1);

        deno = lcm / deno;
        deno1 = lcm / deno1;
        num = deno * num;
        num1 = deno1 * num1;
        num = num - num1;

        return new RationalNumbers(num, lcm);
    }

    public static RationalNumbers divide(RationalNumbers object1, RationalNumbers object2) {

        int deno = object1.getDenominator();
        int deno1 = object2.getDenominator();

        int num = object1.getNumerator();
        int num1 = object2.getNumerator();

        int temp = num1;
        num1 = deno1;
        deno1 = temp;

        int tempNum = num * num1;
        int tempDeno = deno * deno1;

        return new RationalNumbers(tempNum, tempDeno);

    }
}
