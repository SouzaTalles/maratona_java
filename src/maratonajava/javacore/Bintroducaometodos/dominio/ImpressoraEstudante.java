package maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {

        System.out.println("-------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        estudante.nome = "Gohan"; // Altera o Objeto
        // Não é bom alterar o objeto dentro do método
    }
}
