package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(2004, Month.SEPTEMBER, 23);

        long meses = ChronoUnit.MONTHS.between(birthDay, LocalDate.now());
        long dias = ChronoUnit.DAYS.between(birthDay, LocalDate.now());
        long semanas = ChronoUnit.WEEKS.between(birthDay, LocalDate.now());
        long anos = ChronoUnit.YEARS.between(birthDay, LocalDate.now());
        System.out.println("Anos: " + anos);
        System.out.println("Meses: " + meses);
        System.out.println("Semanas: " + semanas);
        System.out.println("Dias: " + dias);

    }

}
