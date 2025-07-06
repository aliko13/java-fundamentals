import java.util.Optional;

public class OptionalBasicExample {
    public static void main(String[] args) {
        String name = "Ali";

        Optional<String> optionalName = Optional.of(name);
        System.out.println("Value present? " + optionalName.isPresent());
        System.out.println("Value: " + optionalName.get());

        Optional<String> empty = Optional.empty();
        System.out.println("Empty optional present? " + empty.isPresent());
    }
}
