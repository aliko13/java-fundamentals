import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("Current Time: " + now);

        LocalTime classStart = LocalTime.of(9, 30);
        System.out.println("Class starts at: " + classStart);

        LocalTime lunch = classStart.plusHours(3);
        System.out.println("Lunch break at: " + lunch);

        long minutesToLunch = ChronoUnit.MINUTES.between(now, lunch);
        System.out.println("Minutes to lunch: " + minutesToLunch);
    }
}
