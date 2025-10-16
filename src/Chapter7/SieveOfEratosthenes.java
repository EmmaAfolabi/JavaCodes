package Chapter7;

import java.util.Arrays;

public class SieveOfEratosthenes {

    boolean[] prime = new boolean[1000];

    public void findPrime() {

        setValues(); // sets all boolean array values to be true

        // The sieve logic
        // we only need to check up to the square root of the array's length.
        for (int index = 2; index * index < prime.length; index++) {

            // If a number is still marked as a prime....
            if (prime[index]) {

                // ...then mark all of its multiples as not prime.
                // This is the more efficient way to mark multiples.
                for (int multiple = index * index; multiple < prime.length; multiple += index) {
                    prime[multiple] = false;
                }
            }
        }

        // Display the results
        int count = 0;
        System.out.println("Prime Numbers from 2 to 999:\n");
        for (int i = 2; i < prime.length; i++) {

            if (prime[i]) {
                System.out.printf("%4d ", i);
                count++;

                if (count % 10 == 0) { // New line every 10 numbers for readability
                    System.out.println();
                }
            }
        }
    }

    public void setValues() {
        // Initialize all numbers (from index 2) as potentially prime.
        Arrays.fill(prime, true);
    }

    public static void main(String[] args) {
        SieveOfEratosthenes sieve = new SieveOfEratosthenes();

        sieve.findPrime();
    }
}
