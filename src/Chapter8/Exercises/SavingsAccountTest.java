package Chapter8.Exercises;

public class SavingsAccountTest {

    public static void main(String[] args) {



        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        SavingsAccount.modifyInterestRate(0.04);
        double balance1, balance2;

        for (int month = 1; month <=13; month++) {

            balance1 = saver1.calculateMonthlyInterest();
            saver1.setSavingsBalance(balance1);

            balance2 = saver2.calculateMonthlyInterest();
            saver2.setSavingsBalance(balance2);

            System.out.printf("   Month %d%nSaver 1%nNew Balance is: %.2f%n%nSaver 2%nNew Balance is %.2f%n%n", month,
                    balance1, balance2);
            if (month == 12) {
                SavingsAccount.modifyInterestRate(0.05);
            }
        }
    }
}
