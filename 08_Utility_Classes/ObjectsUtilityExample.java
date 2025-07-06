import java.util.Objects;

public class ObjectsUtilityExample {
    public static void main(String[] args) {
        String name = null;
        String fallback = "Guest";

        // Null-safe equals
        System.out.println("Equals null-safe: " + Objects.equals(name, "Ali"));

        // Non-null check
        try {
            Objects.requireNonNull(name, "Name must not be null!");
        } catch (NullPointerException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        // Provide default if null
        String result = Objects.toString(name, fallback);
        System.out.println("Result with fallback: " + result);
    }
}
