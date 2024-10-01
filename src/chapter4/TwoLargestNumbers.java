package chapter4;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number;
        int firstlargest = 0;
        int secondlargest = 0;

        System.out.println("Enter a series of ten numbers: ");
        number = input.nextInt();

        while (counter <= 10){
            if (number > firstlargest){
                firstlargest = number;
            }
            else
                if (number > secondlargest){
                    secondlargest = number;
                }
        }
        counter++;


    }
}
