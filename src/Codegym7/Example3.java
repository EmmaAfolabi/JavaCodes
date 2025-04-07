package Codegym7;

public class Example3 {
    public static void main(String[] args) {
        int[] list = new int[10];

        // fill the array
        for (int i = 0; i < list.length; i++)
            list[i] = i;

        // display the contents of the array
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i]);

    }
}
