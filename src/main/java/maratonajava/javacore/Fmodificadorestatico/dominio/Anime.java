package maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    // todas as vezes que um objeto é criado acontece isso abaixo na ordem
    // 0 - Bloco de inicialização estático é executado quando a JVM carregar a classe
    // 1 - alocado espaço em memória para o objeto
    // 2 - cada atributo de classe é criado e inicializado com valores default ou quer for passado
    // 3 - bloco de inicialização executado
    // 4 - construtor é executado
    static {
        System.out.println("Dentro do bloco inicialização estático 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco inicialização estático 2");
    }

    static {
        System.out.println("Dentro do bloco inicialização estático 3");
    }

    {
        System.out.println("Dentro do bloco inicialização não estático");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodios: Anime.episodios) {
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

    // Blocos de inicialização estáticos são inicializados apenas uma vez, antes do objeto ser alocado na memória
    // Se tiver mais de 1 a ordem que são executados é a ordem que aparecem no código
    // Não pode acessar atributos de instâncias dentro de métodos estáticos
    // pode ter blocos de inicialização junto com blocos de inicialização estáticos
}