package Codegym7.Generics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Mergelists {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list1 = new ArrayList<Integer>();    // Create a list
        Collections.addAll(list1, 1, 5, 6, 11, 3, 15, 7, 8);    // Fill the list

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        Collections.addAll(list2, 1, 8, 6, 21, 53, 5, 67, 18);

        ArrayList<Integer> result = new ArrayList<Integer>();

        result.addAll(list1);  // Add all values from each list to the new list
        result.addAll(list2);

        for (Integer x : result) {  // A fast way to loop over all elements, only for collections
            System.out.println(x);
        }
    }
}
