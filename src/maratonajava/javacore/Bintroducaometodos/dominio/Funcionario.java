package maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        System.out.println("------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (salarios != null) {
            for (double salario : salarios) {
                System.out.print(salario + " ");
            }
            System.out.println("");
        }
    }
}
