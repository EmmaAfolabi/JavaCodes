package chapter4;

import java.util.Scanner;

public class ValidatingUserinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userinput;

        do {
            System.out.println("enter a value (1 or 2): ");
            userinput = input.nextInt();

            if (userinput != 1 && userinput != 2){
                System.out.println("Invalid input!! please enter 1 or 2");
            }
        } while (userinput != 1 && userinput != 2);

        System.out.printf("You entered a valid value: %d%n", userinput);
    }
}
