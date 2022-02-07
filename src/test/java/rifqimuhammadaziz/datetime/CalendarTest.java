package rifqimuhammadaziz.datetime;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

    @Test
    void create() {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(date);
    }

    @Test
    void modifyCalendar() {
        Calendar calendar = Calendar.getInstance();

        // 21 May 1999 03:20:30
        calendar.set(Calendar.YEAR, 1999);
        calendar.set(Calendar.MONTH, Calendar.MAY);
        calendar.set(Calendar.DAY_OF_MONTH, 21);
        calendar.set(Calendar.HOUR_OF_DAY, 3);
        calendar.set(Calendar.MINUTE, 20);
        calendar.set(Calendar.SECOND, 30);
        calendar.set(Calendar.MILLISECOND, 12);

        Date date = calendar.getTime();
        System.out.println(date);
        System.out.println(date.getTime());
    }

    @Test
    void getCalendar() {
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH)); // 0:January, 1:February...
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
    }
}
