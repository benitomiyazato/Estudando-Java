package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.AircraftSingletonEager;

public class AircraftEagerInitializationTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1B");
    }

    private static void bookSeat(String seat) {
        AircraftSingletonEager a = AircraftSingletonEager.getInstance();
        System.out.println(a.bookSeat(seat));
    }
}
