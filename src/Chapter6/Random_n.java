package Chapter6;

import java.security.SecureRandom;

public class Random_n {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();

        int n = secureRandom.nextInt(5) + 2;  // generates a number
        System.out.println("Secure random number between 2 and 6: " + n);

        int b = secureRandom.nextInt(47) + 4;
        System.out.println("Secure random number between 4 and 50: " + b);

        int c = secureRandom.nextInt(8);
        System.out.println("Secure random number between 0 and 7: " + c);

        int d = secureRandom.nextInt(31) + 1000;
        System.out.println("Secure random number between 1000 and 1030: " + d);

        int e = secureRandom.nextInt(7) - 5;
        System.out.println("Secure random number between -5 and 1: " + e);

        int f = secureRandom.nextInt(12) - 2;
        System.out.println("Secure random number between -2 and 9: " + n);
    }
}
