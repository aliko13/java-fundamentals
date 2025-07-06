import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Ali");
        names.add("Elvin");
        names.add("Shafiga");
        names.add("Ali"); // Allows duplicates

        System.out.println("ArrayList (ordered, duplicates allowed):");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("Element at index 1: " + names.get(1));
    }
}
