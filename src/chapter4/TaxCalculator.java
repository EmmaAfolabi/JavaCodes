package chapter4;

import java.util.Scanner;

public class TaxCalculator {
    public static double calculateTax(double earnings){
        double tax = 0;

        if (earnings <= 30000) {
            tax = earnings * 0.15;
        }
        else {
            tax = 30000 * 0.15;
            tax += (earnings - 30000) * 0.20;
        }

        return tax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i =1; i <= 3; i++){
            System.out.printf("Enter the name of the citizen %d: %n", i);
            String name = scanner.next();

            System.out.printf("Enter earnings of %s:$%n", name);
            double earnings = scanner.nextDouble();

            double tax = calculateTax(earnings);

            System.out.printf("Total tax for %s is: $%.2f%n", name, tax);
            System.out.println();
        }
    }
}
