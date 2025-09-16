package Codegym7.Generics;

import java.io.IOException;
import java.util.ArrayList;

public class DivideArray {
    public static void main(String[] args) throws IOException {
        int[] data = {1, 5, 6, 11, 3, 15, 7, 8};

        ArrayList<Integer> list = new ArrayList<Integer> ();

        for (int i = 0; i < data.length; i++) list.add(data[i]);

        ArrayList<Integer> even = new ArrayList<Integer>(); // Even number
        ArrayList<Integer> odd = new ArrayList<Integer>(); // Odd number

        for (int i = 0; i < list.size(); i++)
        {
            Integer x = list.get(i);
            if (x % 2 == 0)
                even.add(x);
            else
                odd.add(x);
        }

        System.out.println("Original list: " + list);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
