package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonEager {
    private String name;
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("787-900");
    private final Set<String> availableSeats = new HashSet<>();

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }

    public String getName() {
        return name;
    }

    public static AircraftSingletonEager getInstance() {
        return INSTANCE;
    }
}
