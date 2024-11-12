package Chapter6;

public class Exercise {
    public static void main(String[] args) {
        System.out.printf("Math.abs(-7.5) = %f%n", Math.abs(-7.5));
        System.out.printf("Math.floor(5 + 2.5) = %f%n", Math.floor(5 + 2.5));
        System.out.printf("Math.abs(9) + Math.ceil(2.2) = %f%n", Math.abs(9) + Math.ceil(2.2));
        System.out.printf("Math.ceil(-5.2) = %f%n", Math.ceil(-5.2));
        System.out.printf("Math.abs(-5) + Math.abs(4) = %d%n", Math.abs(-5) + Math.abs(4));
        System.out.printf("Math.ceil(-6.4) - Math.floor(5.2) = %f%n", Math.ceil(-6.4) - Math.floor(5.2));
        System.out.printf("Math.ceil(-Math.abs(-3 + Math.floor(-2.5)) = %f%n", Math.ceil(-Math.abs(-3 + Math.floor(-2.5))));
    }
}
