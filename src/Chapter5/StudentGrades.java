package Chapter5;

import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        String studentName;
        char grade;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter student name:");
            studentName = input.next();

            System.out.println("Enter student grade (A, B, C, D):");
            grade = input.next().charAt(0);

            switch (grade) {
                case 'A':
                    countA++;
                    break;
                case 'B':
                    countB++;
                    break;
                case 'C':
                    countC++;
                    break;
                case 'D':
                    countD++;
                    break;
                default:
                    System.out.println("Invalid grade entered. Please enter a grade from A, B, C, or D.");
                    i--;
                    break;
            }
        }
    }
}
