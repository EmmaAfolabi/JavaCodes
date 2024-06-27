package chapter3;

public class ModifyAccount {
    private String name;
    private double balance;

    public ModifyAccount(String name, double balance){
        this.name = name;

        if(balance > 0.0){
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount){
        if (depositAmount > 0.0){
            this.balance = balance + depositAmount;
        }
    }

    public void withdraw(double withdrawalAmount){
       if (withdrawalAmount < this.balance){
           this.balance = this.balance- withdrawalAmount;
           System.out.printf("successful withdrawal");
       }
       else{
           System.out.println("Withdrawal amount exceeded!");
       }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance= balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
