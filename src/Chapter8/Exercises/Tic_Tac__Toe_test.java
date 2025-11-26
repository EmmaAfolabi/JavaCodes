package Chapter8.Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tic_Tac__Toe_test {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Tic_Tac_Toe obj = new Tic_Tac_Toe();

        System.out.printf("TIC-TAC-TOE!%nPlay with computer 1%nPlay with human 2%n");
        try {
            int choice = input.nextInt();

            if (choice == 1)
                obj.playWithComputer();
            else if (choice == 2)
                obj.play();
        }
        catch (InputMismatchException e) {

            System.out.printf(e.getMessage());
        }
    }
}
