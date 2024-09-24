package chapter4;

import java.util.Scanner;

public class SalesCommissionCalculator {
        private double totalitemvalues =0;
        private double totalearnings;

        public void recordofsolditems (){
                int itemCounter =1;
                int itemNumber;
                double total =0;
                Scanner input = new Scanner(System.in);
                System.out.println("Kindly input from 1 to 4 for the item type sold and 0 to terminate: ");
                int type = input.nextInt();

                while (type != 0)
                {
                        System.out.println("How many item type was sold? ");
                        itemNumber = input.nextInt();
                        if (type ==1)
                                total = (double) itemNumber * 239.99;
                        else if (type ==2)
                                total = (double) itemNumber * 129.75;
                        else if (type ==3)
                                total = (double) itemNumber * 99.95;
                        else if (type ==4)
                                total = (double) itemNumber * 350.89;
                        else {
                                System.out.println("Item not found! Input items 1 to 4");
                        }
                        totalitemvalues += total;
                        itemCounter ++;

                        System.out.println("Enter next item or 0 to terminate: ");
                        type = input.nextInt();
                }

        }
        public double calculateEarnings()
        {
                totalearnings = totalitemvalues * 0.09 + 200;
                return totalearnings;
        }

        public static void main(String[] args) {
                SalesCommissionCalculator calculator = new SalesCommissionCalculator();

                calculator.recordofsolditems();
                double earnings = calculator.calculateEarnings();

                System.out.printf("Total value of items sold: $%.2f%n", calculator.totalitemvalues);
                System.out.printf("Total earnings: $%.2f%n", earnings);

        }
}
