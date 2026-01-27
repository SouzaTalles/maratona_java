package maratonajava.javacore.ZZHpadroesdeprojoetos.dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonLazy {
    private static AircraftSingletonLazy INSTANCE;
    private final Set<String> availabeSeats = new HashSet<>();
    private final String name;

    {
        availabeSeats.add("1A");
        availabeSeats.add("1B");
    }

    private AircraftSingletonLazy(String name) {
        this.name = name;
    }

    public static AircraftSingletonLazy getInstance() {
        if (INSTANCE == null) {
            synchronized (AircraftSingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AircraftSingletonLazy("787-900");
                }
            }
        }
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        synchronized (this.availabeSeats) {
            return availabeSeats.remove(seat);
        }
    }
}
