package maratonajava.javacore.Dconstrutores.test;

import maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "Ação", "Production IG");
        anime.imprime();
    }
}
