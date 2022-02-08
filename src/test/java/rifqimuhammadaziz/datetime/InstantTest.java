package rifqimuhammadaziz.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class InstantTest {

    @Test
    void create() {
        Instant instant1 = Instant.now();
        System.out.println(instant1);

        // 1970-01-01T00:00:00Z
        Instant instant2 = Instant.ofEpochMilli(0);
        System.out.println(instant2);
    }

    @Test
    void modify() {
        Instant instant1 = Instant.now();
        Instant instant2 = instant1.plusMillis(2000);
        Instant instant3 = instant1.minusMillis(1000);

        System.out.println(instant1);
        System.out.println(instant2);
        System.out.println(instant3);
    }

    @Test
    void get() {
        Instant instant = Instant.now();

        System.out.println(instant.toEpochMilli()); // get Milli UNIX Epoch
        System.out.println(instant.getEpochSecond()); // get Second UNIX Epoch
        System.out.println(instant.getNano()); // get now nanosecond
    }

    @Test
    void fromInstant() {
        Instant instant = Instant.now(); // UTC

        ZoneId zoneId = ZoneId.of("Asia/Jakarta"); // set zone

        // convert instant to LocalTime by ZoneId (Time Only)
        LocalTime localTime = LocalTime.ofInstant(instant, zoneId);
        System.out.println(localTime);

        // convert instant to LocalDateTime by ZoneId (Date & Time)
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zoneId);
        System.out.println(localDateTime);

        // convert instant to ZonedDateTime by ZoneId (Date, Time, Offset, ZoneId)
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, zoneId);
        System.out.println(zonedDateTime);

        // convert instant to OffsetDateTime by ZoneId (Date, Time, Offset)
        OffsetDateTime offsetDateTime = OffsetDateTime.ofInstant(instant, zoneId);
        System.out.println(offsetDateTime);
    }

    @Test
    void toInstant() {
        Instant instant1 = LocalDateTime.now().toInstant(ZoneOffset.ofHours(7));
        System.out.println(instant1);

        Instant instant2 = ZonedDateTime.now().toInstant();
        System.out.println(instant2);

        Instant instant3 = OffsetDateTime.now().toInstant();
        System.out.println(instant3);

    }
}
