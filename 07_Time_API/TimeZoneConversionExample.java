import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneConversionExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2025, 6, 29, 14, 0);
        System.out.println("Local DateTime: " + localDateTime);

        // Create ZonedDateTime for Berlin
        ZonedDateTime berlinTime = localDateTime.atZone(ZoneId.of("Europe/Berlin"));
        System.out.println("Berlin time: " + berlinTime);

        // Convert to New York
        ZonedDateTime newYorkTime = berlinTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("New York time: " + newYorkTime);

        // Convert to Tokyo
        ZonedDateTime tokyoTime = berlinTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println("Tokyo time: " + tokyoTime);
    }
}
