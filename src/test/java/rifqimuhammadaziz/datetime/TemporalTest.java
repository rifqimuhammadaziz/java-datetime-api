package rifqimuhammadaziz.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.temporal.*;
import java.util.ArrayList;
import java.util.List;

public class TemporalTest {

    @Test
    void temporal() {
        // all these are inheritance from temporal
        Temporal temporal1 = LocalDate.now();
        Temporal temporal2 = LocalTime.now();
        Temporal temporal3 = ZonedDateTime.now();
        Temporal temporal4 = Year.now();
    }

    @Test
    void temporalAmount() {
        Temporal temporal1 = LocalDateTime.now();
        Temporal temporal2 = temporal1.plus(Duration.ofHours(5)); // time now + 5 hours
        Temporal temporal3 = temporal1.plus(Period.ofDays(2)); // date now + 2 days

        System.out.println(temporal1);
        System.out.println(temporal2);
        System.out.println(temporal3);
    }

    @Test
    void temporalUnit() {
        long temporalUnit1 = ChronoUnit.MINUTES.between(LocalTime.now(), LocalTime.now().plusHours(2));
        System.out.println(temporalUnit1); // 120 minutes
    }

    @Test
    void temporalField() {
        Temporal temporal = LocalDateTime.now();
        System.out.println(temporal.get(ChronoField.YEAR));
        System.out.println(temporal.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(temporal.get(ChronoField.DAY_OF_MONTH));
        System.out.println(temporal.get(ChronoField.HOUR_OF_DAY));
        System.out.println(temporal.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println(temporal.get(ChronoField.SECOND_OF_MINUTE));
        System.out.println(temporal.get(ChronoField.MILLI_OF_SECOND));
        System.out.println(temporal.get(ChronoField.NANO_OF_SECOND));
    }

    @Test
    void temporalQuery() {
        // create temporal list
        Temporal temporal = LocalDateTime.now();

        List<Integer> list = temporal.query(new TemporalQuery<List<Integer>>() {
            @Override
            public List<Integer> queryFrom(TemporalAccessor temporal) {
                ArrayList<Integer> list = new ArrayList<>();

                list.add(temporal.get(ChronoField.YEAR));
                list.add(temporal.get(ChronoField.MONTH_OF_YEAR));
                list.add(temporal.get(ChronoField.DAY_OF_MONTH));

                return list;
            }
        });

        System.out.println(list);
    }

    @Test
    void temporalAdjuster() {
        Temporal temporal1 = LocalDate.now();
        System.out.println(temporal1);

        // transform temporal manual
        Temporal temporal2 = temporal1.with(new TemporalAdjuster() {
            @Override
            public Temporal adjustInto(Temporal temporal) {
                return LocalDate.of(
                        temporal.get(ChronoField.YEAR),
                        temporal.get(ChronoField.MONTH_OF_YEAR),
                        2
                );
            }
        });
        System.out.println(temporal2);

        // transform temporal automatic
        Temporal temporal3 = temporal1.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(temporal3);
        Temporal temporal4 = temporal1.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(temporal4);
    }
}
