package Chapter6;

public class AsteriskSquare {

    public static void squareOfAsterisks(int value) {

        for (int i = 1; i <= value; i++) {
            for (int a = 1; a <= value; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
