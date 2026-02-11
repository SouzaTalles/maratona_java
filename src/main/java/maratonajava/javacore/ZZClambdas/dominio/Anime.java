package maratonajava.javacore.ZZClambdas.dominio;

public class Anime {
    private String title;
    private Integer episodes;

    public Anime(String title, Integer episodes) {
        this.title = title;
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", quantity=" + episodes +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public Integer getEpisodes() {
        return episodes;
    }
}
