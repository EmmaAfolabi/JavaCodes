package Chapter5;

public class Diamond {
    public static void main(String[] args) {
        int n = 5;

        //top half of the diamond
        for (int i = 1; i <= n; i++) {
            //print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
        }
    }
}
