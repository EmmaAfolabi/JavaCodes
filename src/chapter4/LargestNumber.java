package chapter4;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 0;
        int number;
        int largest = 0;

        System.out.println("Enter a a series of 10 integers: ");
        number = input.nextInt();

        while (counter <= 10){

            if (number>largest){
                largest = number;
            }
            counter ++;
            System.out.printf("The largest of %d numbers is: %d%n", counter, largest);
        }
    }
}
