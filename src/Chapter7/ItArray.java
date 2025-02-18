package Chapter7;


public class ItArray {
    // create and output two-dimensional arrays
    public static void main(String[] args) {
        int [] [] array1 = {{1, 2, 3}, {4, 5, 6}};
        int [] [] array2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("Values in array1 by row are");
        outputArray(array1);  // displays array1 by row

        System.out.printf("%nValues in array2 by row are%n");
        outputArray(array2); // displays array2 by row
    }

    // output rows and columns of a two-dimensional array
    public static void outputArray(int [][] array) {
        // loop through array's rows

    }
 }
