package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L,"Berserk", 19.9, 0));
        mangas.add(new Manga(1L,"Hellsing Ultimate", 9.5, 5));
        mangas.add(new Manga(4L,"Pokemon", 3.2,0));
        mangas.add(new Manga(3L,"Attack on Titan", 11.2, 2));
        mangas.add(new Manga(2L,"Dragon ball Z", 2.99, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        // HashSet: Não mantém a ordem de que foi colocada e não pode repetição
        // LinkedHashSet: não pode repetição e mantém a ordem que foi colocado cada elemento

    }
}
