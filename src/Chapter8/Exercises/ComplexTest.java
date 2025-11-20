package Chapter8.Exercises;

import java.util.Scanner;

public class ComplexTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter complex number values:(real, imaginary)");
            double real = input.nextDouble();
            double imaginary = input.nextDouble();

            Complex obj1 = new Complex(real, imaginary);

            System.out.println("Enter complex number values:(real, imaginary");
            double real1 = input.nextDouble();
            double imaginary1 = input.nextDouble();

            Complex obj2 = new Complex(real1, imaginary1);

            System.out.println(obj1.addComplexNumbers(obj2));
        }

    }
}
