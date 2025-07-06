import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TerminalOperations {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "filter", "map", "reduce");

        System.out.println("Count:");
        long count = words.stream().count();
        System.out.println("Total words: " + count);

        System.out.println("\nAny word starts with 'f'?");
        boolean anyStartsWithF = words.stream().anyMatch(w -> w.startsWith("f"));
        System.out.println(anyStartsWithF);

        System.out.println("\nAll words longer than 3?");
        boolean allLong = words.stream().allMatch(w -> w.length() > 3);
        System.out.println(allLong);

        System.out.println("\nFind First:");
        Optional<String> first = words.stream().findFirst();
        first.ifPresent(System.out::println);

        System.out.println("\nJoined string:");
        String joined = String.join(", ", words);
        System.out.println(joined);
    }
}
