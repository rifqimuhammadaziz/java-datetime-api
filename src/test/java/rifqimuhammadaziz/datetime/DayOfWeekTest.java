package rifqimuhammadaziz.datetime;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

public class DayOfWeekTest {

    @Test
    void create() {
        DayOfWeek dayOfWeek1 = DayOfWeek.SUNDAY;
        DayOfWeek dayOfWeek2 = dayOfWeek1.plus(1); // SUNDAY + 1 Day

        System.out.println(dayOfWeek2);
    }
}
