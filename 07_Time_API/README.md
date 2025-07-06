# Java Time API

The Java Time API (`java.time`) is a modern and powerful date/time library introduced in Java 8. It handles date, time, and timezone-related operations in an immutable and thread-safe way.

---

## Files Overview

| File                            | Focus Area                                         |
|----------------------------------|----------------------------------------------------|
| LocalDateExample.java           | Dates only (`LocalDate`)                          |
| LocalTimeExample.java           | Times only (`LocalTime`)                          |
| LocalDateTimeExample.java       | Combined date & time                              |
| ZonedDateTimeExample.java       | Timezones and global time                         |
| DurationPeriodExample.java      | Period (dates) & Duration (times)                 |
| DateTimeFormattingExample.java  | Formatting and parsing date-time values           |
| InstantExample.java             | UTC Instant and epoch milliseconds                |
| TimeZoneConversionExample.java  | Timezone conversion (Berlin ↔ Tokyo, NY, etc.)    |
| CustomDateTimeFormatters.java   | Formatting with custom `DateTimeFormatter`        |

---

## Key Classes

| Class               | Description                                               |
|---------------------|-----------------------------------------------------------|
| `LocalDate`         | Only date (no time)                                       |
| `LocalTime`         | Only time (no date)                                       |
| `LocalDateTime`     | Date and time (no timezone)                               |
| `ZonedDateTime`     | Date + time + timezone                                    |
| `Instant`           | UTC timestamp used for precise moments in time            |
| `Period`            | Date-based difference (e.g. years/months/days)            |
| `Duration`          | Time-based difference (e.g. hours/minutes/seconds)        |
| `DateTimeFormatter` | Formatting and parsing `LocalDateTime` and others         |
| `ZoneId` / `ZoneOffset` | For timezone and offset-based calculations         |

---

## Additional Topics Covered

| Topic                    | Summary                                                                 |
|--------------------------|-------------------------------------------------------------------------|
| **Instant**              | Represents a UTC timestamp (no timezone)                                |
| **Time Zone Conversion** | Convert between timezones using `withZoneSameInstant()`                |
| **Custom Formatters**    | Full control over date-time display formats using `DateTimeFormatter`   |

---

## Instant vs LocalDateTime vs ZonedDateTime

| Type              | Timezone Aware | Best For                                |
|-------------------|----------------|------------------------------------------|
| `Instant`         | Yes (UTC only) | System timestamps, epoch millis         |
| `LocalDateTime`   | No             | Generic datetime logic (e.g. database)  |
| `ZonedDateTime`   | Yes            | Real-time clock apps, multi-timezone    |

---

## Formatting Examples

```java
DateTimeFormatter fullFormat = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm:ss z");
String formatted = zonedDateTime.format(fullFormat);
```

---

## Timezone Conversion Example

```java
ZonedDateTime berlin = ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
ZonedDateTime tokyo = berlin.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
```

---

## How to Run

```bash
javac LocalDateExample.java
java LocalDateExample

javac LocalTimeExample.java
java LocalTimeExample

javac LocalDateTimeExample.java
java LocalDateTimeExample

javac ZonedDateTimeExample.java
java ZonedDateTimeExample

javac DurationPeriodExample.java
java DurationPeriodExample

javac DateTimeFormattingExample.java
java DateTimeFormattingExample

javac InstantExample.java
java InstantExample

javac TimeZoneConversionExample.java
java TimeZoneConversionExample

javac CustomDateTimeFormatters.java
java CustomDateTimeFormatters
