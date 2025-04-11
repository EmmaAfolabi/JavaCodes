package Codegym7.Generics;

import Codegym7.ArrayList;

import java.io.IOException;

public class evenandoddnumbers {
    public static void main(String[] args) throws IOException {
        // Static initialization of the array
        int[] data = {1, 5, 6, 11, 3, 15, 7, 8};

        // Create a list where all elements are Integers
        ArrayList&ltInteger> list = new ArrayList&ltInteger> ();

        // Use the array to fill the list
        for (int i = 0; i < data.length; i++) list.add(data[i]);

        ArrayList&ltInteger> even = new ArrayList&ltInteger>();     // Even numbers
        ArrayList&ltInteger> odd = new ArrayList&ltInteger>();      // odd numbers

        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            if (x % 2 == 0)     // If x is even
                even.add(x);    // Add x to the collection of even numbers
            else
                odd.add(x);
        }
    }
}
