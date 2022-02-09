package rifqimuhammadaziz.datetime;

import org.junit.jupiter.api.Test;

import java.sql.Time;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class LegacyTest {

    // convert legacy to new
    @Test
    void fromLegacyToNew() {
        // legacy
        Date date = new Date();
        System.out.println(date);
        // new datetime api
        Instant instant = date.toInstant();
        System.out.println(instant);

        // legacy
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        // new datetime api
        Instant instant1 = calendar.toInstant();
        System.out.println(instant1);

        // legacy
        TimeZone timeZone = TimeZone.getDefault();
        System.out.println(timeZone);
        // new datetime api
        ZoneId zoneId = timeZone.toZoneId();
        System.out.println(zoneId);
    }

    // convert new to legacy
    @Test
    void fromNewToLegacy() {
        // new datetime api
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        // convert to legacy
        Date date = Date.from(zonedDateTime.toInstant());
        System.out.println(date);

        // convert to legacy
        Calendar calendar = GregorianCalendar.from(zonedDateTime);
        System.out.println(calendar);

        // new datetime api
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        // convert to legacy
        TimeZone timeZone = TimeZone.getTimeZone(zoneId);
        System.out.println(timeZone);


    }
}
