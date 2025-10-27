package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class InteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L,"Berserk", 19.9, 0));
        mangas.add(new Manga(1L,"Hellsing Ultimate", 9.5, 5));
        mangas.add(new Manga(4L,"Pokemon", 3.2,0));
        mangas.add(new Manga(3L,"Attack on Titan", 11.2, 2));
        mangas.add(new Manga(2L,"Dragon ball Z", 2.99, 0));

        // Antiga forma de remover do Java 7
//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()) {
//            if (mangaIterator.next().getQuantidade() == 0) {
//                mangaIterator.remove();
//            }
//        }

        // forma de remover adicionada no Java 8
        mangas.removeIf(manga -> manga.getQuantidade() == 0);

        System.out.println(mangas);
    }
}
