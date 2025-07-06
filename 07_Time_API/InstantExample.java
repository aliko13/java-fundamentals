import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantExample {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("UTC Instant: " + now);

        // Convert Instant to ZonedDateTime (e.g., Berlin)
        ZonedDateTime berlinTime = now.atZone(ZoneId.of("Europe/Berlin"));
        System.out.println("Berlin ZonedDateTime: " + berlinTime);

        // Epoch milliseconds
        long millis = now.toEpochMilli();
        System.out.println("Epoch milliseconds: " + millis);
    }
}
