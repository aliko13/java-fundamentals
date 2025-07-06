import java.io.*;

public class LegacyFileIOExample {
    public static void main(String[] args) {
        File file = new File("legacy_output.txt");

        // Writing using PrintWriter
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.println("Legacy I/O example");
            writer.println("Writing using java.io.PrintWriter");
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }

        // Reading using BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("Reading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println("  " + line);
            }
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}
