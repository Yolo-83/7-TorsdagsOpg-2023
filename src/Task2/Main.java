package Task2;

public class Main {
    public static void main(String[] args) {

        // Try / Catch exceptions
        try {
            Circle c = new Circle(2);
            System.out.println(c.area());
            c.setRadius(3);
            System.out.println(c.area());
            c.setRadius(-1); // Throws Exception: The Radius must not be negative
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
