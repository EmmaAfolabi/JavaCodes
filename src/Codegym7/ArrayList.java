package Codegym7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayList {
    public static void main(String[] args) {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        // Read strings from the keyboard
        ArrayList&ltString> list = new ArrayList()&ltString>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        // display the contents of the collection
        for (int i = 0; i < list.size(); i++) {
            int j = list.size() - i - 1;
            System.out.println( list.get(j) );
        }
    }
}
