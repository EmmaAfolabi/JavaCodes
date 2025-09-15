package Codegym7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList; // Import the ArrayList class from java.util

public class ArrayListDemo { // Renamed the class to avoid naming conflict
    public static void main(String[] args) throws IOException { // Added IOException to the method signature
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        // Read strings from the keyboard
        ArrayList<String> list = new ArrayList<String>(); // Fixed generic syntax
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        // display the contents of the collection
        for (int i = 0; i < list.size(); i++) {
            int j = list.size() - i - 1;
            System.out.println(list.get(j));
        }
    }
}
