import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadToListExample {
    public static void main(String[] args) {
        try {
            List<String> names = Files.readAllLines(Path.of("names.txt"));

            System.out.println("Names from file:");
            names.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
