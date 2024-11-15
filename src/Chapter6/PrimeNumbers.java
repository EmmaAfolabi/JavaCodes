package Chapter6;

public class PrimeNumbers {

    public static boolean findPrime(int number) {

        if (number <= 1) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;

        int sqrt = (int) Math.sqrt(number);
        for (int i = 5; i <= sqrt; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void printPrimes(int max) {
        for (int i = 2; i < max; i++) {
            if (findPrime(i)) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printPrimes(10000);
    }
}
