import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class NumericStreamOperations {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 7, 2, 9, 3, 5, 2);

        System.out.println("Original Numbers:");
        numbers.forEach(System.out::println);

        System.out.println("\nDistinct & Sorted:");
        numbers.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nEven Numbers:");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println("\nDoubled Values:");
        numbers.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);

        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println("\nStatistics:");
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());
    }
}
