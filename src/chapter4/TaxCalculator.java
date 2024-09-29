package chapter4;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i =1; i <= 3; i++){
            System.out.println("Enter the name of the citizen: ");
            String name = scanner.next();

            System.out.printf("Enter earnings of %s:$", name);
            double earnings = scanner.nextDouble();



        }
    }
}
