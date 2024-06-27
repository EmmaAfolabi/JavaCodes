package chapter3;

import java.util.Scanner;

public class ModifyAccountTest {
    public static void main(String[] args) {
        ModifyAccount account1 = new ModifyAccount("Jane Green", 100.00);
        ModifyAccount account2 = new ModifyAccount("John Blue", 250.00);

        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit ammount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());

        System.out.print("Enter amount to be withdrawn from account1: ");
        double withdawalAmount = input.nextDouble();
        account1.withdraw(withdawalAmount);

//        if (withdawalAmount < account1.getBalance()){
//            account1.setBalance(account1.getBalance()- withdawalAmount);
//            System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
//        }
//        if (withdawalAmount > account1.getBalance()){
//            System.out.print("Withdrawal amount exceeded account balance!");
//        }
    }
}
