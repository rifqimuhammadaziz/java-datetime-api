package rifqimuhammadaziz.datetime;

import org.junit.jupiter.api.Test;

import java.sql.PreparedStatement;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodTest {

    // Duration in Date

    @Test
    void create() {
        Period period1 = Period.ofDays(10);
        Period period2 = Period.ofWeeks(4);
        Period period3 = Period.ofMonths(12);
        Period period4 = Period.ofYears(2);
        Period period5 = Period.of(9, 10, 5);

        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4);
        System.out.println(period5);
    }

    @Test
    void get() {
        Period period = Period.of(10, 11, 20);

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }

    @Test
    void between() {
        // count age from birthday
        Period period = Period.between(
                LocalDate.of(1999, 5, 21),
                LocalDate.now()
        );

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}
