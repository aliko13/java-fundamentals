import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class NioFileExample {
    public static void main(String[] args) {
        Path path = Paths.get("nio_output.txt");

        try {
            // Write lines to file
            Files.write(path, List.of("NIO example", "Using java.nio.file.Files"),
                    StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

            // Read all lines
            List<String> lines = Files.readAllLines(path);
            System.out.println("Reading with NIO:");
            lines.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("NIO error: " + e.getMessage());
        }
    }
}
