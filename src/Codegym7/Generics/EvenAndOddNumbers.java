package Codegym7.Generics;

import java.io.IOException;
import java.util.ArrayList; // Use the proper ArrayList from java.util

public class EvenAndOddNumbers {
    public static void main(String[] args) throws IOException {
        // Static initialization of the array
        int[] data = {1, 5, 6, 11, 3, 15, 7, 8};

        // Create a list where all elements are Integers
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Use the array to fill the list
        for (int i = 0; i < data.length; i++) {
            list.add(data[i]);
        }

        ArrayList<Integer> even = new ArrayList<Integer>();     // Even numbers
        ArrayList<Integer> odd = new ArrayList<Integer>();      // odd numbers

        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            if (x % 2 == 0)     // If x is even
                even.add(x);    // Add x to the collection of even numbers
            else
                odd.add(x);
        }

        // Print the results (optional, but helpful to verify)
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
