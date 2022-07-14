package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.AircraftSingletonLazy;

public class AircraftLazyTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        AircraftSingletonLazy a = AircraftSingletonLazy.getInstance();
        System.out.println(a.bookSeat(seat));
    }
}
