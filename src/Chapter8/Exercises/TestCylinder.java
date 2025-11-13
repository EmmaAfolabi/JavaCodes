package Chapter8.Exercises;

class Cylinder {
    private double radius;
    private double height;

    public Cylinder() {
        this.radius = 1.0;
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        setRadius(radius);
        setHeight(height);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Error!: Radius must be positive. Set value to 1.0");
            this.radius = 1.0;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Error!: Height must be positive. Set value to 1.0");
            this.height = 1.0;
        }
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    public void displayInfo() {
        System.out.println("Cylinder Properties");
        System.out.println("Radius: " + radius);
        System.out.println("Height: " + height);
        System.out.printf("Volume: %.2f\n", getVolume());
        System.out.println();
    }
}

public class TestCylinder {
    public static void main(String[] args) {
        System.out.println("   Testing Cylinder Class    \n");


        System.out.println("Test 1: Creating cylinder with default values");
        Cylinder cylinder1 = new Cylinder();
        cylinder1.displayInfo();

        System.out.println("Test 2: Creating cylinder with radius=3.5 and height=7.0");
        Cylinder cylinder2 = new Cylinder(3.5, 7.0);
        cylinder2.displayInfo();

        System.out.println("Test 3: Modifying cylinder1 using setters");
        cylinder1.setRadius(2.0);
        cylinder1.setRadius(5.0);
        cylinder1.displayInfo();

        System.out.println("Test 4: Attempting to set negative values");
        Cylinder cylinder3 = new Cylinder();
        cylinder3.setRadius(-3.0);
        cylinder3.setHeight(-5.0);
        cylinder3.displayInfo();

        System.out.println("Test 5: Using getter methods");
        System.out.println("Cylinder2 radius: " + cylinder2.getRadius());
        System.out.println("Cylinder2 height: " + cylinder2.getHeight());
        System.out.printf("Cylinder2 volume: %.2f\n", cylinder2.getVolume());
    }
}
