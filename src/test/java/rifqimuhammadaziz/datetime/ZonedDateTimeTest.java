package rifqimuhammadaziz.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest {

    @Test
    void create() {
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(
                LocalDateTime.now(),
                ZoneId.of("Asia/Jakarta")
        );
        ZonedDateTime zonedDateTime3 = ZonedDateTime.now(ZoneId.of("GMT")); // +0:00
        ZonedDateTime zonedDateTime4 = ZonedDateTime.now(ZoneOffset.ofHours(7));

        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime3);
        System.out.println(zonedDateTime4);
    }

    @Test
    void parseString() {
        ZonedDateTime zonedDateTime1 = ZonedDateTime.parse("1999-10-20T05:00:24+07:00[Asia/Jakarta]");
        ZonedDateTime zonedDateTime2 = ZonedDateTime.parse("1999-10-20T05:00:24+05:00");

        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);
    }

    @Test
    void changeZoneId() {
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        System.out.println(zonedDateTime1);

        // change zone only (not change time) [Asia/Jakarta] to [GMT]
        ZonedDateTime zonedDateTime2 = zonedDateTime1.withZoneSameLocal(ZoneId.of("GMT"));

        // change zone & time [Asia/Jakarta] to [GMT] (+0:00)
        ZonedDateTime zonedDateTime3 = zonedDateTime1.withZoneSameInstant(ZoneId.of("GMT"));

        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime3);
    }
}
