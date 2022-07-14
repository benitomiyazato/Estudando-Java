package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(2004, Month.SEPTEMBER, 23);
        Period myAge = Period.between(birthDay, LocalDate.now());
        System.out.println(myAge);

        Period p1 = Period.ofWeeks(58); // 58 semanas = 406 dias, como transformar em meses? --> ChronoUnit
        System.out.println(p1);
    }

}
