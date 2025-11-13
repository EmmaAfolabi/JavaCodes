package Chapter8.Exercises;

public class Cylinder {
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
}
