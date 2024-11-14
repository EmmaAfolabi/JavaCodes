package Chapter6;

public class SquareOfcharacter {

    public static void displayCharacter(char fill, int size) {


        for (int i = 1; i <= size; i++) {
            for (int a = 1; a <= size; a++) {
                System.out.print(fill);
            }
            System.out.println();
        }
    }
}
