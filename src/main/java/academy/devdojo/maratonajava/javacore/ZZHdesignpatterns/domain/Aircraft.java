package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain;

import java.util.HashSet;
import java.util.Set;

public class Aircraft {
    private String name;

    public String getName() {
        return name;
    }

    private final Set<String> availableSeats = new HashSet<>();

    public Aircraft(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
