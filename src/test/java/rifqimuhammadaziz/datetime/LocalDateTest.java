package rifqimuhammadaziz.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {

    @Test
    void create() {
        LocalDate localDate1 = LocalDate.now(); // get local date now
        LocalDate localDate2 = LocalDate.of(1999, Month.MAY, 21); // set date
        LocalDate localDate3 = LocalDate.parse("1945-07-17"); // parse string to date

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }

    @Test
    void with() {
        LocalDate localDate1 = LocalDate.now();
        localDate1.withYear(2020); // create new object / not replace existing object (immutable)

        LocalDate localDate2 = localDate1.withYear(2020); // set date by create new object
        LocalDate localDate3 = localDate2.withYear(1945).withMonth(7);

        System.out.println(localDate1); // date now (not 2020)
        System.out.println(localDate2); // 2020
        System.out.println(localDate3); // 1945-07
    }

    @Test
    void modify() {
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = localDate1.plusYears(3); // 2022 + 3
        LocalDate localDate3 = localDate1.minusMonths(1); // month 8 - 1

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }

    @Test
    void get() {
        LocalDate localDate1 = LocalDate.now();

        System.out.println(localDate1.getYear());
        System.out.println(localDate1.getMonth());
        System.out.println(localDate1.getMonthValue());
        System.out.println(localDate1.getDayOfMonth());
        System.out.println(localDate1.getDayOfWeek());
    }
}
