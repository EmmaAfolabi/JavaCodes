package chapter3;

import java.util.Scanner;

public class HeartRates {
     String firstname = ("Emma");
     String lastname;
     int dateofbirth;
     String month; int day; int yearofbirth;
     int age;

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


    public HeartRates(String firstname, String lastname, int dateofbirth, String month, int day, int yearofbirth) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateofbirth = dateofbirth;
        this.month = month;
        this.day = day;
        this.yearofbirth = yearofbirth;
    }

    public int getAge() {
        age = 2024 - yearofbirth;
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        HeartRates info = new HeartRates("emma", "ade", 19_12_4, "december", 19, 2001);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your firstname: ");
        info.firstname = input.next();

        System.out.println("Enter your lastname: ");
        info.lastname = input.next();

        System.out.println("Enter your day of birth: ");
        info.day = input.nextInt();

        System.out.println("Enter your month of birth: ");
        info.month = input.next();

        System.out.println("Enter your year of birth: ");
        info.yearofbirth = input.nextInt();

        int maximumheartrate = 220 - info.getAge();
        double targetheartrate = (0.75) * maximumheartrate ;

        System.out.printf("first name: %s%n " +
                "lastname: %s%n",info.firstname, info.lastname );
        System.out.printf("Date of birth : %d, %s, %d%n", info.getDay(), info.getMonth(), info.getYearofbirth());
        System.out.printf("Your age: %d%n", info.getAge());
        System.out.println("Your maximum heart rate in beats per minute is " + maximumheartrate);
        System.out.println("Your target heart rate is " + targetheartrate);

//        info.firstname = info.getFirstname();
//        info.lastname = info.getLastname();
//        info.dateofbirth = info.getDateofbirth();
//        info.age = info.getAge();
//        System.out.println();
    }
}
