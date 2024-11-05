package Chapter5;

public class Diamond {
    public static void main(String[] args) {
        int n = 5;

        // top half of the diamond
        for (int i = 1; i <= n; i++) {
            // print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // print asterisks
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // move to the next line
            System.out.println();
        }

        // bottom half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // print asterisks
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // move to the next line
            System.out.println();
        }
    }
}
