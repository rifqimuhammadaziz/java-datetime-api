package rifqimuhammadaziz.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class LocalTimeTest {

    @Test
    void create() {
        LocalTime localTime1 = LocalTime.now(); // get time now
        LocalTime localTime2 = LocalTime.of(12, 45, 30); // set time
        LocalTime localTime3 = LocalTime.parse("08:45"); // parse string to time

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);
    }

    @Test
    void with() {
        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = localTime1.withHour(7);
        LocalTime localTime3 = localTime1.withHour(4).withMinute(20);

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);
    }

    @Test
    void modify() {
        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = localTime1.plusHours(2);
        LocalTime localTime3 = localTime1.plusHours(4).minusMinutes(59);

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);
    }

    @Test
    void get() {
        LocalTime localTime = LocalTime.now();

        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.getNano());
    }
}
