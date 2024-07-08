package chapter3;

import java.util.Scanner;

public class HealthProfile {
    String firstname;
    String lastname;
    String gender;
    String dateofbirth;
    int year;
    int maximumRate;
    double heightininches;
    double weightinpounds;


    public HealthProfile(String firstname, String lastname, String gender, int day, int month, int year, double weight, double height) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.dateofbirth = day + "-" + month + "-" + year;
        this.year = year;
        this.heightininches = height;
        this.weightinpounds = weight;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDateofbirth(int day, int month, int year) {
        this.dateofbirth = day + "-" + month + "-" + year;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

    public String retunDOB(){
        return dateofbirth;
    }

    public void setWeight(double weight) {
        this.weightinpounds = weight;
    }

    public double getWeight() {
        return weightinpounds;
    }

    public void setHeight(double height) {
        this.heightininches = height;
    }

    public double getHeight() {
        return heightininches;
    }

    public int calculateAge() {
        int age = 2024 - year;
        return age;
    }

    public int calculatemaxHeartRate(){
        int age = 2024 - year;
        int maxHeartRate = 220 - age;
        this.maximumRate = maxHeartRate;
        return maximumRate;
    }

    public double calculateTargetHeartRate(){
        double target = (0.75) * maximumRate;
        return target;
    }

    public double calculateBMI(){
        double BMI = ((weightinpounds * 703) /(heightininches * heightininches)) ;
        return BMI;
    }
}
