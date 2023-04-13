package Task2;

public class Main {
    public static void main(String[] args) {

        // Try / Catch exceptions
        try {
            Circle c = new Circle(2);
            System.out.println(c.area()); // Output: 12.56
            c.setRadius(3);
            System.out.println(c.area()); // Output: 28.26
            c.setRadius(-1); // Throws Exception: Radius must be non-negative
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
