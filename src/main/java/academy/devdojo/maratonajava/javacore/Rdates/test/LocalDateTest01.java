package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate dateX = LocalDate.of(2004, Month.SEPTEMBER, 23);
        System.out.println(dateX);
        System.out.println(dateX.getDayOfMonth());
        System.out.println(dateX.getDayOfYear());
        System.out.println(dateX.getDayOfWeek());
        System.out.println(dateX.getMonth());
        System.out.println(dateX.getYear());
        dateX = dateX.plusYears(18);
        System.out.println(dateX);
    }

}
