package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime lct1 = LocalDateTime.now();
        System.out.println(lct1);

        LocalDate date1 = LocalDate.of(2004, Month.SEPTEMBER, 23);
        LocalTime time1 = LocalTime.of(23, 55);

        LocalDateTime lct2 = date1.atTime(time1);
        System.out.println(lct2);
    }
}
