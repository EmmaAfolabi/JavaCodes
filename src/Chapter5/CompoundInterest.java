package Chapter5;

public class CompoundInterest {

    public void calculateYearlyInterest() {
        double principal = 1000.00;

        for (double rate = 0.05; rate <= 10; rate += 0.01) {
            System.out.printf("Interest rate: %.2f%%%n", rate * 100);
            System.out.printf("%-4s%20s%n", "Year", "Amount on deposit");
        }
    }
}
