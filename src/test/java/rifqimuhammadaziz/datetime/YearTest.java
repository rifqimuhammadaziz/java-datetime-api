package rifqimuhammadaziz.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class YearTest {

    @Test
    void create() {
        // Year Only
        Year year1 = Year.now();
        Year year2 = Year.of(1999); // set year
        Year year3 = Year.parse("2012"); // parse string to year

        System.out.println(year1);
        System.out.println(year2);
        System.out.println(year3);

        // Year & Month Only
        YearMonth yearMonth1 = YearMonth.now();
        YearMonth yearMonth2 = YearMonth.of(1992, Month.MAY);
        YearMonth yearMonth3 = YearMonth.parse("1999-10");

        System.out.println(yearMonth1);
        System.out.println(yearMonth2);
        System.out.println(yearMonth3);

        // Month & Day Only
        MonthDay monthDay1 = MonthDay.now();
        MonthDay monthDay2 = MonthDay.of(Month.OCTOBER, 20); // set MonthDay
        MonthDay monthDay3 = MonthDay.parse("--10-20"); // parse string to MonthDay

        System.out.println(monthDay1);
        System.out.println(monthDay2);
        System.out.println(monthDay3);
    }

    // transform Year to LocalDate
    @Test
    void conversion() {
        // set year
        Year year = Year.of(1999);
        System.out.println(year);

        // set month & day
        LocalDate localDate = year.atMonth(10).atDay(20);
        System.out.println(localDate);

        // get month & day from localDate
        MonthDay monthDay = MonthDay.from(localDate);
        System.out.println(monthDay);
    }

    // get Year & YearMonth
    @Test
    void get() {
        Year year = Year.now();
        YearMonth yearMonth = YearMonth.now();
        MonthDay monthDay = MonthDay.now();

        System.out.println(year.getValue()); // get year
        System.out.println(yearMonth.getYear()); // get year from yearMonth
        System.out.println(yearMonth.getMonth()); // get month from yearMonth
        System.out.println(monthDay.getMonth()); // get month from monthDay
        System.out.println(monthDay.getDayOfMonth()); // get day from monthDay
    }
}
