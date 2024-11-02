package Chapter5;

public class Error2 {
    public static void main(String[] args) {
        int value =0 ;
        if (value < 0) {
            System.out.println("Negative");
        } else if (value == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Positive");
        }
    }
}
