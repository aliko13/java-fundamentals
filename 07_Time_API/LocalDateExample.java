import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        LocalDate birthday = LocalDate.of(1995, 3, 12);
        System.out.println("Birthday: " + birthday);

        System.out.println("Day of week: " + birthday.getDayOfWeek());

        LocalDate nextWeek = today.plusWeeks(1);
        System.out.println("Next week: " + nextWeek);

        long daysBetween = ChronoUnit.DAYS.between(birthday, today);
        System.out.println("Days since birth: " + daysBetween);
    }
}
