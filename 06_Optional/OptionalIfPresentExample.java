import java.util.Optional;

public class OptionalIfPresentExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Elvin");

        name.ifPresent(n -> System.out.println("Hello, " + n));

        Optional<String> empty = Optional.empty();
        empty.ifPresent(n -> System.out.println("This won't print."));
    }
}
