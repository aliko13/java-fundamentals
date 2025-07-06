import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Now: " + now);

        LocalDateTime future = now.plusDays(5).withHour(14).withMinute(0);
        System.out.println("Meeting scheduled at: " + future);
    }
}
