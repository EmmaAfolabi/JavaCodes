package Chapter8.Exercises;

public class SavingsAccount {


    private static double annualInterestRate;

    private double savingsBalance;

    public SavingsAccount(double savings) {

        this.savingsBalance = savings;

    }


    public static void modifyInterestRate(double rate) {

        SavingsAccount.annualInterestRate = rate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterest() {

        double monthlyinterest = (savingsBalance * annualInterestRate) / 12;

        return monthlyinterest + savingsBalance;
    }
}
