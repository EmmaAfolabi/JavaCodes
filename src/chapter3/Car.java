package chapter3;

public class Car {
    private String Model;
    private String Year;
    private double Price;

    public Car (String Model){
        this.Model = Model;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public Car(String Year, double price) {
        this.Year = Year;
        this.Price = Price;
    }


}
