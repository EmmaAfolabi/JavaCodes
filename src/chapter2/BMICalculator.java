package chapter2;
//

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in kg: ");
        double weight = input.nextDouble();

        System.out.println("Enter height in m: ");
        double height = input.nextDouble();

        double BMI = weight * 703 / ( height * height );
        double BMI2 = weight / (height * height) ;

        System.out.printf("compute BMI: %.1f%n", BMI2);
        System.out.println("BMI categories:\n Underweight = <18.5\n Normal weight = 18.5 - 24.9\n Overweight = 25-29.9\n Obesity = BMI of 30 or greater");

    }
}
