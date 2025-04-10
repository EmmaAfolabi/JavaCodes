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
        list.add(Integer.parseInt(s));
    }
}
