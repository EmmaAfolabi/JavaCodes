package Chapter5;

public class ModifiedCompoundInterest {

    public void calculateInterest()
    {
        int principal = 1000 * 100;
        double rate = 1 + 0.05;
        int years = 10;
        int dollars = 0;
        int cents = 0;
        double amount = 0;

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        for (int i = 1; i <= years; i++) {

            amount = principal * Math.pow(rate, i);
            dollars = (int) amount / 100;
            cents = (int) amount % 100;

            System.out.printf("%4d%12s%d.%dc%n", i, "$", dollars, cents);

        }

    }

    public static void main(String[] args) {

        ModifiedCompoundInterest pennies = new ModifiedCompoundInterest();

        pennies.calculateInterest();
    }
}
