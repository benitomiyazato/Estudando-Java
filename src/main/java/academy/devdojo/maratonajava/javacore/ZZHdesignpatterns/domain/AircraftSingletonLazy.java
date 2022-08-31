package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonLazy {
    private String name;
    private static AircraftSingletonLazy instance;
    private final Set<String> availableSeats = new HashSet<>();

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    private AircraftSingletonLazy(String name) {
        this.name = name;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }

    public String getName() {
        return name;
    }

    public static AircraftSingletonLazy getInstance() {
        if (instance == null) {
            synchronized (AircraftSingletonLazy.class) {
                if (instance == null) {
                    instance = new AircraftSingletonLazy("787-900");
                }
            }
        }
        return instance;
    }
}
