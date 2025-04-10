package Codegym7.Generics;

import Codegym7.ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Readnumbers {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> list = new ArrayList<Integer>();

    while (true) {
        String s = reader.readLine();
        if (s.isEmpty()) break;

        int x = Integer.parseInt(s);
        if (x % 2 == 0)  // check that the remainder is zero when we divide by two
            list.add(x);    // add to the end
        else
            list.add(0, x);  // add to the beginning
    }
}
