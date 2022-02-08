package rifqimuhammadaziz.datetime;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Set;

public class ZoneTest {

    @Test
    void createZoneId() {
        ZoneId zoneId = ZoneId.systemDefault(); // get timezone OS
        System.out.println(zoneId);

        ZoneId zoneIdGMT = ZoneId.of("GMT"); // set zone
        System.out.println(zoneIdGMT);

        // get all ZoneId
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.forEach(id -> System.out.println(id));
    }

    @Test
    void createZoneOffset() {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        ZoneOffset zoneOffsetJakarta1 = ZoneOffset.of("+07:00"); // use time format (+07:00)
        ZoneOffset zoneOffsetJakarta2 = ZoneOffset.ofHours(7); // use integer (+07:00)
        ZoneOffset zoneOffsetJakarta3 = ZoneOffset.ofHoursMinutes(5, 30); // +5.30

        System.out.println(zoneOffset);
        System.out.println(zoneOffsetJakarta1);
        System.out.println(zoneOffsetJakarta2);
        System.out.println(zoneOffsetJakarta3);
    }
}
