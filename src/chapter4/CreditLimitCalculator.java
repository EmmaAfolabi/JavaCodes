package chapter4;

public class CreditLimitCalculator {
    private int accountnumber;
    private int balancebegining;
    private int allitemscharged;
    private int allcredits;
    private int creditlimit;
    private int newbalance;

    public CreditLimitCalculator(int accountnumber, int balancebegining, int allitemscharged, int allcredits, int creditlimit, int newbalance) {
        this.accountnumber = accountnumber;
        this.balancebegining = balancebegining;
        this.allitemscharged = allitemscharged;
        this.allcredits = allcredits;
        this.creditlimit = creditlimit;
        this.newbalance = newbalance;
    }

    public int getAccountnumber() {
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
        return allitemscharged;
    }

    public void setAllitemscharged(int allitemscharged) {
        this.allitemscharged = allitemscharged;
    }

    public int getAllcredits() {
        return allcredits;
    }

    public void setAllcredits(int allcredits) {
        this.allcredits = allcredits;
    }

    public int getCreditlimit() {
        return creditlimit;
    }

    public void setCreditlimit(int creditlimit) {
        this.creditlimit = creditlimit;
    }

    public int getNewbalance() {
        newbalance = balancebegining + allitemscharged - allcredits;
        return newbalance;
    }

    public void setNewbalance(int newbalance) {
        this.newbalance = newbalance;
    }

    public void checkCreditLimit () {
        if (newbalance > creditlimit)
            System.out.println("Credit limit exceeded");
    }
}
