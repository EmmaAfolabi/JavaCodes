package Chapter6;

import java.util.Scanner;

public class AsteriskSquare {

    public static void squareOfAsterisks(int value) {

        for (int i = 1; i <= value; i++) {
            for (int a = 1; a <= value; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of square asterisks");
        int size = input.nextInt();

        squareOfAsterisks(size);
    }
}
