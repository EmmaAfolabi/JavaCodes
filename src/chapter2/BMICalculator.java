package chapter2;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Weight in kg: ");
        int weight = input.nextInt();

        System.out.println("Height in m: ");
        int height = input.nextInt();

        int BMI = weight/(height * height);
        System.out.printf("BMI is %d%n", BMI);
        if (BMI < 18){
            System.out.println( "Underweight");
        }
        if (BMI == (19-24)){
            System.out.println("Normal weight");
        }
        if (BMI == (25-29)){
            System.out.println("Overweight");
        }
        if (BMI > 30){
            System.out.println("Obesity");
        }
    }
}
