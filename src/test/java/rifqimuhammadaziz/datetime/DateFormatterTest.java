package rifqimuhammadaziz.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateFormatterTest {

    @Test
    void parsing() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");

        // default format
        LocalDate localDate1 = LocalDate.parse("1999-10-20");
        System.out.println(localDate1);

        // using format
        LocalDate localDate2 = LocalDate.parse("21 05 1999", formatter);
        System.out.println(localDate2);
    }

    @Test
    void formatting() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");

        LocalDate localDate = LocalDate.parse("20 10 1999", formatter);
        String format = localDate.format(formatter);

        // formatted output
        System.out.println(format);

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before Formatting: " + now);
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = now.format(format2);
        System.out.println("After Formatting: " + formatDateTime);
    }

    @Test
    void defaultFormatter() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");

        LocalDate localDate = LocalDate.parse("20 10 1999", formatter);
        String format = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);

        // ISO_LOCAL_DATE
        System.out.println(format);
    }

    @Test
    void i18nFormat() {
        Locale locale = new Locale("in", "ID");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MMMM dd", locale);

        LocalDate localDate = LocalDate.now();
        String format = localDate.format(formatter);

        // Month by Locale
        System.out.println(format);
    }
}
