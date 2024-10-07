package chapter4;

import java.util.Scanner;

public class Palindrome {
    private int number;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isPalindrome() {
        int reversedInt = 0;
        int InitialNum = number;
        int remainder;
        int tempNumber = number;

        while (tempNumber > 0) {
            remainder = tempNumber % 10;
            reversedInt = reversedInt * 10 + remainder;
            tempNumber = tempNumber / 10;
        }

        return reversedInt == InitialNum;
    }

    public static void main(String[] args) {
        Palindrome palindromeChecker = new Palindrome();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check if it's a palindrome: ");
        int userInput = input.nextInt();

        palindromeChecker.setNumber(userInput);

        if (palindromeChecker.isPalindrome()) {
            System.out.println(userInput + "is a palindrome.");
        } else {
            System.out.println(userInput + "is not a palindrome.");
        }
    }
}
