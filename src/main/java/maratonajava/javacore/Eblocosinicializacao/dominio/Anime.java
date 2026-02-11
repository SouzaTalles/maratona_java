package maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime  {
    private String nome;
    private int[] episodios;
    // todas as vezes que um objeto é criado acontece isso abaixo na ordem
    // 1 - alocado espaço em memória para o objeto
    // 2 - cada atributo de classe é criado e inicializado com valores default ou quer for passado
    // 3 - bloco de inicialização executado
    // 4 - construtor é executado
    {
        System.out.println("Dentro do bloco inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodios: this.episodios) {
            System.out.print(episodios + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}