import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class DurationPeriodExample {
    public static void main(String[] args) {
        // Period (date-based)
        LocalDate start = LocalDate.of(2023, 1, 1);
        LocalDate end = LocalDate.of(2025, 6, 30);
        Period period = Period.between(start, end);
        System.out.println("Period between: " + period);
        System.out.println("Years: " + period.getYears() + ", Months: " + period.getMonths());

        // Duration (time-based)
        LocalTime t1 = LocalTime.of(9, 0);
        LocalTime t2 = LocalTime.of(11, 45);
        Duration duration = Duration.between(t1, t2);
        System.out.println("Duration in minutes: " + duration.toMinutes());
    }
}
