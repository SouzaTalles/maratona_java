package maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Detro do bloco inicialização estático de Funcionario");
    }

    {
        System.out.println("Detro do bloco inicialização de Funcionario 1");
    }

    {
        System.out.println("Detro do bloco inicialização de Funcionario 2");
    }

    public Funcionario() {
        super();
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor Funcionario");
    }

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salario de R$" + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
