package maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // OPERADOR TERNARIO

        // Doar se salario > 5000
        double salario = 6000;

        // (condicao) ? verdadeiro : falso;
        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condição, mas vou ter";

        System.out.println(resultado);
    }
}
