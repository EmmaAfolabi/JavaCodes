package chapter4;

import java.util.Scanner;

public class Freestyle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int totalGrade = 0;
        int gradeCounter = 1;

        while (gradeCounter <=6) {
            System.out.print("Enter grade: ");
            int grade = input.nextInt();
            totalGrade += grade;
            gradeCounter = gradeCounter +1;
        }

        double average = totalGrade / 10;

        System.out.printf("%nTotal of 6 grades is %d%n", totalGrade);
        System.out.printf("Class average is %.2f%n", average);
    }
}
