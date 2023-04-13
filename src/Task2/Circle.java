package Task2;

public class Circle {
    private int radius;

    public Circle(int radius) throws Exception {
        setRadius(radius);
    }

    public void setRadius(int radius) throws Exception {
        if (radius <= 0) {
            throw new Exception("The Radius must not be negative");
        }
        this.radius = radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }
}

