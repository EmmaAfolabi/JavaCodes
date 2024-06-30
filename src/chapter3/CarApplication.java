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
        System.out.printf("Price of %s is $%.2f%n", myCar1.getModel(), myCar1.getPrice());


        System.out.println("Enter the model of the other car you want to check out: ");
        String amount = input.next();
        Car mycar2 = new Car(amount);
        mycar2.setModel(mycar2.getModel());
        mycar2.setPrice(20000);
        System.out.printf("Price of %s is $%.2f%n ", mycar2.getModel(),mycar2.getPrice());

    }
}
