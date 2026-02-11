package maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 + numero02;
        System.out.println(resultado);

        // % -> resto da divisão
        int resto = 10 % 2;
        System.out.println(resto);

        // <, >, <=, >=, ==, != -> booleanos
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferentelDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte );
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferentelDez);

        // && (and), || (or), ! (not) -> operadores lógicos
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta );
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorToTalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorToTalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // =, +=, -=, *=, /= %= -> Atribuição
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++, --
        int contador = 0;
        contador += 1; // contador + contador + 1;
        contador++;
        contador--;
        ++contador; // primeiro soma
        --contador;
        int contador2 = 0;
        System.out.println(++contador2);
    }
}
