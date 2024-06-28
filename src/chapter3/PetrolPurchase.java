package chapter3;

public class PetrolPurchase {
    private String location;
    private String petroltype;
    private int quantityinliters;
    private double priceperliter;
    private double percentagediscount;

    public PetrolPurchase(String location, String petroltype, int quantityinliters, double priceperliter, double percentagediscount) {
        this.location = location;
        this.petroltype = petroltype;
        this.quantityinliters = quantityinliters;
        this.priceperliter = priceperliter;
        this.percentagediscount = percentagediscount;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return location;
    }

    public void setpetroltype(String petroltype) {
        this.petroltype = petroltype;
    }
    public String getpetroltype() {
        return petroltype;
    }

    public void setquantityinliters(int quantityinliters) {
        this.quantityinliters = quantityinliters;
    }
    public int getquantityinliters() {
        return quantityinliters;
    }

    public double getpriceperliter() {
        return priceperliter;
    }
    public void setpriceperliter(double priceperliter) {
        this.priceperliter = priceperliter;
    }

    public double getPercentagediscount() {
        return percentagediscount;
    }
    public void setPercentagediscount(double percentagediscount) {
        this.percentagediscount = percentagediscount;
    }

    public double getPurchaseAmount() {
        double PurchaseAmount = (quantityinliters * priceperliter) - percentagediscount;
        return PurchaseAmount;
    }
}
