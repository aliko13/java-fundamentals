import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> tools = new HashSet<>();

        tools.add("Java");
        tools.add("Git");
        tools.add("Docker");
        tools.add("Java"); // Duplicate

        System.out.println("HashSet (unordered, unique values):");
        for (String tool : tools) {
            System.out.println(tool);
        }

        System.out.println("Contains 'Git'? " + tools.contains("Git"));
    }
}
