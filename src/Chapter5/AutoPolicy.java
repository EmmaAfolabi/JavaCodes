package Chapter5;
//class that represents an auto insurance policy
public class AutoPolicy {
    private int accountNumber;     //policy account number
    private String makeAndModel;  //car that the policy applies to
    private String state;        //two-letter state abbreviation

    //constructor
    public AutoPolicy(int accountNumber, String makeAndModel,
                      String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    //sets the accountNumber
    public int getAccountNumber() {
        return accountNumber;
    }

    //returns the accountNumber
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    //sets the makeandModel
    public String getMakeAndModel() {
        return makeAndModel;
    }

    //returns the makeAndModel
    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    //sets the state
    public String getState() {
        return state;
    }

    //returns the state
    public void setState(String state) {
        this.state = state;
    }
}
