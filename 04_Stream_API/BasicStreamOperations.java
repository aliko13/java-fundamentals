import java.util.Arrays;
import java.util.List;

public class BasicStreamOperations {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ali", "Elvin", "Shafiga", "Ayxan");

        System.out.println("Original List:");
        names.forEach(System.out::println);

        System.out.println("\nUppercase Names:");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("\nNames that start with 'A':");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);

        System.out.println("\nSorted List:");
        names.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
