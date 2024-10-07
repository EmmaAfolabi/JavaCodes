package chapter4;

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
}
