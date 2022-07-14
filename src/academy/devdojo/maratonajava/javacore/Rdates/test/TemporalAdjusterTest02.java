package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class getNextUtilDay implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        int amountToAdd;
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        switch (dayOfWeek) {
            case FRIDAY:
                amountToAdd = 3;
                break;
            case SATURDAY:
                amountToAdd = 2;
                break;
            case SUNDAY:
                amountToAdd = 1;
                break;
            default:
                amountToAdd = 1;
        }
        return temporal.plus(amountToAdd, ChronoUnit.DAYS);
    }

}

public class TemporalAdjusterTest02 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("Antes: " + now);
        now = now.with(new getNextUtilDay());

        System.out.println("Depois: " + now);
    }
}
