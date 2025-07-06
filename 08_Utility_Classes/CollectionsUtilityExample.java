import java.util.*;

public class CollectionsUtilityExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Ali", "Zara", "Mike"));

        // Sort
        Collections.sort(names);
        System.out.println("Sorted: " + names);

        // Reverse
        Collections.reverse(names);
        System.out.println("Reversed: " + names);

        // Shuffle
        Collections.shuffle(names);
        System.out.println("Shuffled: " + names);

        // Frequency
        names.add("Ali");
        int freq = Collections.frequency(names, "Ali");
        System.out.println("Frequency of 'Ali': " + freq);
    }
}
