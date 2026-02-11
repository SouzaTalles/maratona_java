package maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] argss) {
    // Se não quiser digitar a linha de cima completa, basta digitar 'psvm' e tab
        // se tiver nomes de variáveis compostas sempre começar as palavras com letras maiúsculas e a primeira letra minúscula.
          // int, double, float, char, byte, short, long e boolean
        int idade = 30;
        long numeroGrande = 10000000000L;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = 30;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'A';
        // String não é um tipo primitivo
        String nome = "Maria";
        // O valor que colocar no char ele imprime o valor da tabela ascii
        System.out.println("A idade é " + idade + " anos.");
        System.out.println(verdadeiro);
        System.out.println("Oi meu nome é" + nome);
        // atalho para System.out.println é 'sout' + tab
    }
}
