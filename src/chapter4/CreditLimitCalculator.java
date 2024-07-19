package chapter4;

import java.util.Scanner;

public class CreditLimitCalculator {
    private int accountnumber;
    private int balancebegining;
    private int totalitemscharged;
    private int totalcreditsapplied;
    private int allowedcreditlimit;
    private int newbalance;

    public CreditLimitCalculator(int accountnumber, int balancebegining, int allitemscharged, int allcredits, int creditlimit, int newbalance) {
        this.accountnumber = accountnumber;
        this.balancebegining = balancebegining;
        this.totalitemscharged = allitemscharged;
        this.totalcreditsapplied = allcredits;
        this.allowedcreditlimit = creditlimit;
        this.newbalance = newbalance;
    }

    public int getAccountnumber() {
        if (accountnumber >= 10){
            System.out.println("Invalid Account number!");
        }
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public int getBalancebegining() {
        return balancebegining;
    }

    public void setBalancebegining(int balancebegining) {
        this.balancebegining = balancebegining;
    }

    public int getAllitemscharged() {
        return totalitemscharged;
    }

    public void setAllitemscharged(int allitemscharged) {
        this.totalitemscharged = allitemscharged;
    }

    public int getAllcredits() {
        return totalcreditsapplied;
    }

    public void setAllcredits(int allcredits) {
        this.totalcreditsapplied = allcredits;
    }

    public int getCreditlimit() {
        return allowedcreditlimit;
    }

    public void setCreditlimit(int creditlimit) {
        this.allowedcreditlimit = creditlimit;
    }

    public int getNewbalance() {
        newbalance = balancebegining + totalitemscharged - totalcreditsapplied;
        if (newbalance > allowedcreditlimit) {
            System.out.println("Credit limit exceeded");
        }
        return newbalance;
    }

    public void setNewbalance(int newbalance) {
        this.newbalance = newbalance;
    }

    public void checkCreditLimit () {
        if (newbalance > allowedcreditlimit)
            System.out.println("Credit limit exceeded");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CreditLimitCalculator Customer1 = new CreditLimitCalculator(15892645, 0, 2, 3, 4, 600);
        System.out.println("Press 1 to enter your charge account details and 0 to quit: ");
        int chargeaccount = input.nextInt();

        int account = 1;

        while (chargeaccount != 0 ) {

            System.out.println("Enter your account number : ");
            Customer1.accountnumber = input.nextInt();

            System.out.println("Your balance at the beginning of the month is: ");
            Customer1.balancebegining = input.nextInt();

            System.out.println("Total items charged by customer is: ");
            Customer1.totalitemscharged = input.nextInt();

            System.out.println("Total credits applied to account: ");
            Customer1.totalcreditsapplied = input.nextInt();

            System.out.println("Credit limit allowed: ");
            Customer1.allowedcreditlimit = input.nextInt();

            ++account;

            if (Customer1.newbalance > Customer1.allowedcreditlimit) {
                System.out.println("Credit limit exceeded");
            }
            else {
                System.out.printf("Customer's new balance: %d%n", Customer1.getNewbalance());
            }
            System.out.println("Enter 1 to continue and 0 to end: ");
            chargeaccount = input.nextInt();
        }


        //System.out.printf("Customer's new balance: %d%n", Customer1.getNewbalance());

        //f (Customer1.newbalance > Customer1.allowedcreditlimit) {
        //    System.out.println("Credit limit exceeded");
        //}
        //else {
        //    System.out.printf("Customer's new balance: %d%n", Customer1.getNewbalance());
        //}




    }
}
