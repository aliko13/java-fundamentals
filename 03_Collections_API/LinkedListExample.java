import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Eat");
        tasks.add("Code");
        tasks.addFirst("Wake Up");
        tasks.addLast("Sleep");

        System.out.println("LinkedList (double-ended queue):");
        for (String task : tasks) {
            System.out.println(task);
        }

        System.out.println("First element: " + tasks.getFirst());
        System.out.println("Last element: " + tasks.getLast());
    }
}
