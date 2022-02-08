package rifqimuhammadaziz.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest {

    @Test
    void create() {
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.of(1945, Month.AUGUST, 17, 5, 9, 50, 44);
        LocalDateTime localDateTime3 = LocalDateTime.parse("1999-05-21T03:40:20.456");

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void with() {
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = localDateTime1.withYear(1999);
        LocalDateTime localDateTime3 = localDateTime1.withHour(20);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void modify() {
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = localDateTime1.plusYears(5);
        LocalDateTime localDateTime3 = localDateTime1.plusHours(2);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void get() {
        LocalDateTime localDateTime1 = LocalDateTime.now();

        System.out.println(localDateTime1.getYear());
        System.out.println(localDateTime1.getMonth());
        System.out.println(localDateTime1.getDayOfMonth());
        System.out.println(localDateTime1.getHour());
        System.out.println(localDateTime1.getMinute());
        System.out.println(localDateTime1.getSecond());
        System.out.println(localDateTime1.getNano());
    }

    // transform to and from LocalDate
    @Test
    void date() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        // get date only
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);

        // add time to date (the result is LocalDateTime)
        LocalDateTime finalResult = localDate.atTime(17, 30, 10);
        System.out.println(finalResult);
    }

    // transform to and from LocalTime
    @Test
    void time() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        // get time only
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localTime);

        // add date to time (the result is LocalDateTime)
        LocalDateTime finalResult = localTime.atDate(LocalDate.now());
        System.out.println(finalResult);
    }
}
