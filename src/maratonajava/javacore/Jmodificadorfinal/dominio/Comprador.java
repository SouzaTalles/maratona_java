package maratonajava.javacore.Jmodificadorfinal.dominio;

public class Comprador {
    private String nome;

    @Override
    public String toString() {
        return "comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
