package Chapter7;
// Generic ArrayList<E> collection demonstration
import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        // create a new ArrayList of Strings with an initial capacity of 10
        ArrayList<String> items = new ArrayList<String>();

        items.add("red"); // append an item to the list
        items.add(0, "yellow"); // insert "yellow" at index 0

        // header
        System.out.println(
                "Display list contents with counter-controlled loop:");

        // display the colors in the list
        for (int i = 0; i < items.size(); i++) {
            System.out.printf(" %s", items.get(i));
        }
    }
}
