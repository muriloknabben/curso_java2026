package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        // https://docs-oracle-com.translate.goog/javase/8/docs/api/java/time/format/DateTimeFormatter.html?_x_tr_sl=en&_x_tr_tl=pt&_x_tr_hl=pt&_x_tr_pto=tc
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2008-10-28");
        LocalDateTime d05 = LocalDateTime.parse("2008-10-28T11:38:08");
        Instant d06 = Instant.parse("2008-10-28T11:38:08Z");
        Instant d07 = Instant.parse("2008-10-28T08:38:08-03:00");

        LocalDate d08 = LocalDate.parse("28/10/2008", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("28/10/2008 08:38", fmt2);

        LocalDate d10 = LocalDate.of(2008, 10, 28);
        LocalDateTime d11 = LocalDateTime.of(2008, 10, 28, 8, 38);
;
        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);

        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);

        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);

        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);

    }
}
