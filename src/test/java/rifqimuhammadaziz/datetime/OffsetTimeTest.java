package rifqimuhammadaziz.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class OffsetTimeTest {

    @Test
    void create() {
        OffsetTime offsetTime1 = OffsetTime.now();
        OffsetTime offsetTime2 = OffsetTime.now(ZoneId.of("Asia/Jakarta")); // only get offset (+07:00) | not with zoneId
        OffsetTime offsetTime3 = OffsetTime.of(13, 20, 10, 10, ZoneOffset.ofHours(7));
        OffsetTime offsetTime4 = OffsetTime.parse("20:10:09.00+07:00");

        System.out.println(offsetTime1);
        System.out.println(offsetTime2);
        System.out.println(offsetTime3);
        System.out.println(offsetTime4);

        OffsetDateTime offsetDateTime1 = OffsetDateTime.now();
        OffsetDateTime offsetDateTime2 = OffsetDateTime.now(ZoneId.of("Asia/Jakarta"));
        OffsetDateTime offsetDateTime3 = OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.ofHours(7));
        OffsetDateTime offsetDateTime4 = OffsetDateTime.parse("1999-10-20T07:15:20.100+07:00");

        System.out.println(offsetDateTime1);
        System.out.println(offsetDateTime2);
        System.out.println(offsetDateTime3);
        System.out.println(offsetDateTime4);
    }

    @Test
    void convertToLocalTime() {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        // convert to OffsetTime
        OffsetTime offsetTime = localTime.atOffset(ZoneOffset.ofHours(7));
        System.out.println(offsetTime);

        // convert to LocalTime
        LocalTime localTime1 = offsetTime.toLocalTime();
        System.out.println(localTime1);
    }

    @Test
    void convertToLocalDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        // convert to OffsetDateTime
        OffsetDateTime offsetDateTime = localDateTime.atOffset(ZoneOffset.ofHours(7));
        System.out.println(offsetDateTime);

        // convert to LocalDateTime
        LocalDateTime localDateTime1 = offsetDateTime.toLocalDateTime();
        System.out.println(localDateTime1);
    }
}
