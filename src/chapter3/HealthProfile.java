package chapter3;

import java.util.Scanner;

public class HealthProfile {
    String firstname;
    String lastname;
    String gender;
    int dateofbirth;
    String month; int day; int yearofbirth;
    double heightininches;
    double weightinpounds;
    int age;


    public HealthProfile(String firstname, String lastname, String gender, int dateofbirth, String month, int day, int yearofbirth, double heightininches, double weightinpounds) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.dateofbirth = dateofbirth;
        this.month = month;
        this.day = day;
        this.yearofbirth = yearofbirth;
        this.heightininches = heightininches;
        this.weightinpounds = weightinpounds;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(int dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYearofbirth() {
        return yearofbirth;
    }

    public void setYearofbirth(int yearofbirth) {
        this.yearofbirth = yearofbirth;
    }

    public double getHeightininches() {
        return heightininches;
    }

    public void setHeightininches(int heightininches) {
        this.heightininches = heightininches;
    }

    public double getWeightinpounds() {
        return weightinpounds;
    }

    public void setWeightinpounds(double weightinpounds) {
        this.weightinpounds = weightinpounds;
    }

    public int getAge() {
        age = 2024 - yearofbirth;
        return age;
    }

    public int maximumheartrate(){
        int maximumheartrate = 220 - getAge();
        return maximumheartrate;
    }

    public double targetheartrate(){
        double targetheartrate = (0.75) * maximumheartrate();
        return targetheartrate;
    }

    public double BMI(){
        double BMI = (weightinpounds *703) /heightininches * heightininches ;
        return BMI;
    }

    public static void main(String[] args) {
        HealthProfile profile = new HealthProfile("Alabi", "Joshua", "male", 19_12_2002, "april", 12, 2002, 48, 178.574);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your firstname: ");
        profile.firstname = input.next();

        System.out.println("Enter your lastname: ");
        profile.lastname = input.next();

        System.out.println("what is your gender: ");
        profile.gender = input.next();

        System.out.println("Enter your date of birth: ");
        profile.day = input.nextInt();
        System.out.println("Enter your birth month: ");
        profile.month = input.next();
        System.out.println("Enter your year of birth:");
        profile.yearofbirth = input.nextInt();

        System.out.println("Enter your height in inches: ");
        profile.heightininches = input.nextDouble();

        System.out.println("Enter your weight in pounds: ");
        profile.weightinpounds = input.nextDouble();

        System.out.println("first name :" + profile.getFirstname());
        System.out.println("last name :"+ profile.getLastname());
        System.out.println("gender: " + profile.getGender());
        System.out.printf("my date of birth: %d, %s %d%n ",profile.getDay(),  profile.getMonth(), profile.getYearofbirth());
        System.out.println("my height in inches: " + profile.getHeightininches());
        System.out.println("my weight in pounds: " + profile.getWeightinpounds());


    }
}
