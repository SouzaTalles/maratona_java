package maratonajava.javacore.ZZDoptional.repositorio;

import maratonajava.javacore.ZZDoptional.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1, "Boku no hero", 50), new Manga(2, "Overlord", 25));

    public static Optional<Manga> findById(int id) {
        return findBy(m -> m.getId() == id);
    }

    public static Optional<Manga> findByTitle(String name) {
        return findBy(m -> m.getTitle().equals(name));
    }

    private static Optional<Manga> findBy(Predicate<Manga> predicate) {
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                return Optional.of(manga);
            }
        }
        return Optional.empty();
    }
}
