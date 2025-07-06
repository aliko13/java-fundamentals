import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class ReadToStreamExample {
    public static void main(String[] args) {
        try {
            long count = Files.lines(Path.of("names.txt"))
                    .filter(line -> line.startsWith("A"))
                    .count();

            System.out.println("Lines starting with 'A': " + count);

        } catch (IOException e) {
            System.out.println("Stream read error: " + e.getMessage());
        }
    }
}
