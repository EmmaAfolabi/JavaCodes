package Chapter5;

public class ModifiedAutoPolicy {

    private int accountNumber;
    private String makeAndModel;
    private String state;

    public ModifiedAutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        setState(state);
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
        if (state.equals("CT") || state.equals("MA")  || state.equals("ME") || state.equals("NH") || state.equals("NJ") || state.equals("NY") || state.equals("PA") || state.equals("VT")) {
            this.state = state;
        }
        else {
            System.out.println("Error: Invalid state code!");
            this.state = null;
        }
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

    public static void main(String[] args) {
        ModifiedAutoPolicy policy1 = new ModifiedAutoPolicy(123456, "Toyota Camry", "NY");
        ModifiedAutoPolicy policy2 = new ModifiedAutoPolicy(234567, "Honda Accord", "CA");

        if (policy1.getState() != null) {
            System.out.printf("Policy 1:%nAccount Number: %d%nMake and Model: %s%nState: %s%nIs No-fault State: %b%n%n",
                    policy1.getAccountNumber(), policy1.getMakeAndModel(), policy1.getState(), policy1.isNoFaultState());
        }
        if (policy2.getState() != null) {
            System.out.printf("Policy 2:%nAccount Number: %d%nMake and Model: %s%nState: %s%nIs No-fault State: %b%n%n",
                    policy2.getAccountNumber(), policy2.getMakeAndModel(), policy2.getState(), policy2.isNoFaultState());
        }
    }
}