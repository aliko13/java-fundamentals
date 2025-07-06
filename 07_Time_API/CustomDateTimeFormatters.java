import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class CustomDateTimeFormatters {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedNow = now.atZone(ZoneId.of("Europe/Berlin"));

        DateTimeFormatter fullFormat = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm:ss z");
        DateTimeFormatter shortFormat = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");

        System.out.println("Full Format: " + zonedNow.format(fullFormat));
        System.out.println("Short Format: " + zonedNow.format(shortFormat));

        // ISO format
        System.out.println("ISO: " + zonedNow.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
    }
}
