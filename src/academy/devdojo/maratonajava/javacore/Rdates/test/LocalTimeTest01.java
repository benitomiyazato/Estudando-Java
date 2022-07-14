package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime lc = LocalTime.now();
        System.out.println(lc.getHour());
        System.out.println(lc.getMinute());
        System.out.println(lc.getSecond());
        System.out.println(lc.getNano());

    }
}
