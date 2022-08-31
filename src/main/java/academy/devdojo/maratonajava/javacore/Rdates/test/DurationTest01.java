package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.Duration;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        Duration d1 = Duration.between(LocalTime.now().plusHours(23), LocalTime.now());
        System.out.println(d1);
    }

}
