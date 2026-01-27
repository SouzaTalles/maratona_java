package maratonajava.javacore.ZZHpadroesdeprojoetos.dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonEager {
    // Eager initialization
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("787-900");
    private final Set<String> availabeSeats = new HashSet<>();
    private final String name;

    {
        availabeSeats.add("1A");
        availabeSeats.add("1B");
    }

    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    public static AircraftSingletonEager getInstance() {
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return availabeSeats.remove(seat);
    }
}
