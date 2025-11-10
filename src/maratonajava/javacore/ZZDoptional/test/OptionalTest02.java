package maratonajava.javacore.ZZDoptional.test;

import maratonajava.javacore.ZZDoptional.domain.Manga;
import maratonajava.javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {

        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no hero 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("One Piece")
                .orElseGet(() -> new Manga(3, "One Piece", 500));
        System.out.println(newManga);
    }
}
