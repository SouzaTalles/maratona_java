package maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

eu <nome>, morando no endereço <endereço>,
confirmo qeu recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Talles";
        String endereco = "Rua Marcos de Souza, 165";
        double salario = 5000.45;
        String dataRecebmentoSalario = "02/03/2025";

        System.out.println("Eu " + nome + ", morando no endereço " + endereco);
        System.out.println("Confirmo que recebi o salário de " + salario + ", na data " + dataRecebmentoSalario);
    }
}
