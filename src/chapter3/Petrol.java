package chapter3;

import java.util.Scanner;

public class Petrol {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("kindly input where you want to buy the petroleum product?:");
        String thelocation;
        thelocation = input.next();

        System.out.println("kindly input the type of petroleum product you want: ");
        String petroltype;
        petroltype = input.next();

        System.out.println("Kindly input the amount of liters you want to buy: ");
        int quantityinliters;
        quantityinliters = input.nextInt();

        PetrolPurchase location = new PetrolPurchase(thelocation, petroltype,quantityinliters , 580, 5);
        System.out.printf("%s sells %s at $%.2f per liter%n", location.getLocation(),location.getpetroltype(), location.getpriceperliter());
        System.out.printf("A Customer wants to buy %d liters of %s with a discount of %.0f percent%n", quantityinliters, location.getpetroltype(), location.getPercentagediscount());
        location.getPurchaseAmount();
        System.out.printf("The net purchase amount is $%.2f%n", location.getPurchaseAmount());
    }
}
