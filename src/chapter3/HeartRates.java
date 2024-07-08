package chapter3;

import java.util.Scanner;

public class HeartRates {
     String firstname = ("Emma");
     String lastname;
     int day, month, year;
     String dateofbirth;
     int maximumrate;

    public HeartRates(String firstname, String lastname, int day, int month, int year) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int calculateage() {
        int age = 2024 - year;
        return age;
    }

    public int calculateMaxHeartRate(){
        int age = 2024 - year;
        int maxRate = 220 - age;
        this.maximumrate = maxRate;
        return maximumrate;
    }

    public double calculateTargetRate(){
        double target = (double) maximumrate * 0.5;
        return target;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void  setLastname(){
        this.lastname = lastname;
    }

    public void setDateofbirth(int day, int month, int year){
        this.month = month;
        this.day = day;
        this.year = year;
        this.dateofbirth = day + "/" + month + "/" + year;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public String dateofbirth (){
        dateofbirth = day +"/" + month + "/" + year;
        return dateofbirth;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Heart Rate Calculator Program: ");
        System.out.println("Enter your firstname: ");
        String firstname = input.next();

        System.out.println("Enter your lastname: ");
        String lastname = input.next();

        System.out.print("Enter your date of birth \n" + "Day: ");
        int day = input.nextInt();
        System.out.print("Month: ");
        int month = input.nextInt();
        System.out.print("Year: ");
        int year = input.nextInt();

        HeartRates profile = new HeartRates(firstname, lastname, day, month, year);
        System.out.println();
        System.out.println("Your profile are as follows; ");
        System.out.println("Name: " + profile.getFirstname() + " " + profile.getLastname());
        System.out.println("Date of birth is: " + profile.dateofbirth());
        System.out.println("Age: " + profile.calculateage() +" ");

        System.out.println("Maximum heart rate is: " + profile.calculateMaxHeartRate()+" ");
        System.out.println("Target heart rate is: " + profile.calculateTargetRate()+" ");


    }
}
