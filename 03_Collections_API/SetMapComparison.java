import java.util.*;

public class SetMapComparison {
    public static void main(String[] args) {

        // --- Set Comparison ---
        System.out.println("SET COMPARISON:\n");

        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        List<String> values = Arrays.asList("Banana", "Apple", "Cherry", "Apple");

        for (String val : values) {
            hashSet.add(val);
            linkedHashSet.add(val);
            treeSet.add(val);
        }

        System.out.println("HashSet (unordered, no duplicates):");
        System.out.println(hashSet);

        System.out.println("\nLinkedHashSet (insertion order):");
        System.out.println(linkedHashSet);

        System.out.println("\nTreeSet (sorted, no duplicates):");
        System.out.println(treeSet);

        // --- Map Comparison ---
        System.out.println("\n\nMAP COMPARISON:\n");

        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        hashMap.put(3, "Three");
        hashMap.put(1, "One");
        hashMap.put(2, "Two");

        linkedHashMap.put(3, "Three");
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");

        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");

        System.out.println("HashMap (unordered):");
        System.out.println(hashMap);

        System.out.println("\nLinkedHashMap (insertion order):");
        System.out.println(linkedHashMap);

        System.out.println("\nTreeMap (sorted by key):");
        System.out.println(treeMap);
    }
}
