package Chapter8.Exercises;

public class Complex {

    private double real;
    private double imaginary;


    public Complex(double real, double imaginary) {

        this.real = real;
        this.imaginary = imaginary;

    }

    public Complex() {

        this(5, 7);

    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

}
