package chapter3;

import java.util.Scanner;

public class HealthprofileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("My Health Profile");
        System.out.println("Enter your firstname: ");
        String firstname = input.next();

        System.out.println("Enter your lastname: ");
        String lastname = input.next();

        System.out.println("what is your gender: ");
        String gender = input.next();

        System.out.println("Enter your date of birth");
        System.out.println("Enter day: ");
        int day = input.nextInt();

        System.out.println("Enter month: ");
        int month = input.nextInt();

        System.out.println("Enter year: ");
        int year = input.nextInt();

        System.out.println("Enter your height in inches: ");
        double heightininches = input.nextDouble();

        System.out.println("Enter your weight in pounds: ");
        double weightinpounds = input.nextDouble();

        HealthProfile profile = new HealthProfile(firstname, lastname, gender, day, month, year, weightinpounds, heightininches);

        System.out.println();
        System.out.println("Health Profile Record");
        System.out.printf("First name: %s%n", firstname);
        System.out.printf("Last name: %s%n", lastname);
        System.out.printf("Gender: %s%n", gender);
        System.out.printf("Date of Birth: %s%n", profile.retunDOB());
        System.out.printf("Weight: %.1f lbs%n", profile.getWeight());
        System.out.printf("Height: %.1f inch%n", profile.getHeight());
        System.out.printf("Age: %d years%n", profile.calculateAge());
        System.out.printf("Body Mass Index: %.1f%n", profile.calculateBMI());
        System.out.printf("Maximum Heart Rate: %d%n", profile.calculatemaxHeartRate());
        System.out.printf("Target Heart Rate: %.2f%n", profile.calculateTargetHeartRate());
        System.out.println();



        System.out.println("BMI categories:\n Underweight = <18.5\n Normal weight = 18.5 - 24.9\n Overweight = 25-29.9\n Obesity = BMI of 30 or greater");

    }
}

