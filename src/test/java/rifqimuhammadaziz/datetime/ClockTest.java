package rifqimuhammadaziz.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class ClockTest {

    @Test
    void create() {
        Clock clock1 = Clock.systemUTC(); // time UTC
        System.out.println(clock1);

        Clock clock2 = Clock.systemDefaultZone(); // default OS
        System.out.println(clock2);

        Clock clock3 = Clock.system(ZoneId.of("Asia/Jakarta"));
        System.out.println(clock3);
    }

    @Test
    void instant() throws Throwable {
        Clock clock = Clock.system(ZoneId.of("Asia/Jakarta"));

        Instant instant1 = clock.instant(); // get time UTC
        System.out.println(instant1);
        Thread.sleep(1_000);

        Instant instant2 = clock.instant();
        System.out.println(instant2);
    }

    @Test
    void fromClock() {
        Clock clock = Clock.system(ZoneId.of("Asia/Jakarta"));

        Year year = Year.now(clock);
        System.out.println(year);

        YearMonth yearMonth = YearMonth.now(clock);
        System.out.println(yearMonth);

        MonthDay monthDay = MonthDay.now(clock);
        System.out.println(monthDay);

        LocalTime localTime = LocalTime.now(clock);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now(clock);
        System.out.println(localDateTime);

        OffsetTime offsetTime = OffsetTime.now(clock);
        System.out.println(offsetTime);

        OffsetDateTime offsetDateTime = OffsetDateTime.now(clock);
        System.out.println(offsetDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now(clock);
        System.out.println(zonedDateTime);
    }
}
