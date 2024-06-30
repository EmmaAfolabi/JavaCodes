package chapter3;

import java.util.Scanner;

public class ModifiedBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("your weight in kg: ");
        double weight = input.nextDouble();

        System.out.println("your height in m: ");
        double height = input.nextDouble();

        double BMI = weight/(height * height);
        System.out.printf("Compute BMI: %.1f%n", BMI);
        if (BMI < 18.5){
            System.out.println("Underweight!");
        }
        if (BMI == (18.5 - 24.9)){
            System.out.println("Normal weight!");
        }
        if (BMI == (25.0 - 29.9)){
            System.out.println("Overweight!");
        }
        if (BMI >= 30){
            System.out.println("Obesity");
        }
    }
}
