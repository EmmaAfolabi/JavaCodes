package Chapter5;

public class ModifiedAutoPolicy {

    private int accountNumber;
    private String makeAndModel;
    private String state;

    public ModifiedAutoPolicy(int accountNumber, String makeAndModel, String state) {

        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if (state == "CT" || state == "MA" || state == "ME" || state == "NH" || state == "NJ" || state == "NY" || state == "PA" || state == "VT") {
            this.state = state;
        }
        else
            System.out.println("Error!!");
    }

    public boolean isNoFaultState() {

        boolean noFaultState;

        switch (getState()) {
            case "MA": case "NJ": case "NY": case "PA":
            case "CT": case "VT": case "NH": case "ME":
                noFaultState = true;
                break;

            default:
                noFaultState = false;
                break;
        }
        return noFaultState;
    }
}
