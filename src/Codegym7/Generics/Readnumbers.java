package Codegym7.Generics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList; // Use the proper ArrayList class

public class Readnumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>(); // Use ArrayList from java.util

        list.add(1);
        list.add(7);
        list.add(11);
        list.add(3);
        list.add(15);

        // When removing elements in a loop, it's safer to iterate backwards
        // or use an iterator. Here's a backwards iteration approach:
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) > 5) {
                list.remove(i);
            }
        }

        // Print the list to verify results
        System.out.println("Numbers <= 5: " + list);
    }
}
