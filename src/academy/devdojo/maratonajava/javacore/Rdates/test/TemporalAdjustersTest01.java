package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;

import java.time.temporal.TemporalAdjusters;


public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        // System.out.println("Antes: " + date);
        // date = date.with(ChronoField.YEAR, 2024);
        // System.out.println("Depois: " + date);

        date = (date.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)))
                .with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)); // duas sextas-feiras atrás
        System.out.println(date);


    }
}
