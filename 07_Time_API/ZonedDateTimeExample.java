import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime berlinTime = ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
        ZonedDateTime tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println("Berlin time: " + berlinTime);
        System.out.println("Tokyo time: " + tokyoTime);
    }
}
