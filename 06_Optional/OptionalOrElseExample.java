import java.util.Optional;

public class OptionalOrElseExample {
    public static void main(String[] args) {
        Optional<String> maybeValue = Optional.ofNullable(null);

        // Using orElse
        String result1 = maybeValue.orElse("Default Value");
        System.out.println("orElse: " + result1);

        // Using orElseGet
        String result2 = maybeValue.orElseGet(() -> "Generated Value");
        System.out.println("orElseGet: " + result2);

        // Using orElseThrow
        try {
            String result3 = maybeValue.orElseThrow(() -> new IllegalArgumentException("Value is missing!"));
            System.out.println("orElseThrow: " + result3);
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
