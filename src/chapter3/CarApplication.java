package chapter3;

import java.util.Scanner;

public class CarApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter the model of the car you want: %n ");
        String price = input.next();
        Car myCar1 = new Car(price);
        myCar1.setModel(myCar1.getModel());
        myCar1.setPrice(10000);
        System.out.printf("Price of %s is: $%.2f%n", myCar1.getModel(), myCar1.getPrice());
        double discount = myCar1.getPrice() - ((0.5) * myCar1.getPrice());
        System.out.printf("discount for the %s is: $%.2f%n ", myCar1.getModel(), discount);


        System.out.println("Enter your choicest model of car that you want to check out: ");
        String price2 = input.next();
        Car myCar2 = new Car(price2);
        myCar2.setModel(myCar2.getModel());
        myCar2.setPrice(20000);
        System.out.printf("Price of %s is $%.2f%n ", myCar2.getModel(),myCar2.getPrice());
        double discount2 = myCar2.getPrice() - ((0.7) * myCar2.getPrice());
        System.out.printf("discount for %s is: $%.2f%n", myCar2.getModel(),discount2);
    }
}
