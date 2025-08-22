package maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "  Luffy  ";
        String numeros = "012345";
        System.out.println(nome.charAt(2)); // retorna o char baseado no índice
        System.out.println(nome.length()); // para saber o tamanho da string
        System.out.println(nome.replace("f", "l")); // trocar todos os caracteres da primeira posição, nesse exemplo vai trocar F por L, vai percorrer toda a string e fazer a troca
        System.out.println(nome.toLowerCase()); // Vai transformar tudo em lower case
        System.out.println(nome.toUpperCase()); // Vai transformar tudo em upper case

        System.out.println(numeros.length());
        System.out.println(numeros.substring(0, 2)); // usado para fazer uma "divisão" da string, o segundo parâmetro é exclusivo (valor - 1)
        System.out.println(numeros.substring(3)); // numero escolhido até o final
        System.out.println(numeros.substring(3, numeros.length())); // numero escolhido até o final

        System.out.println(nome.trim()); // remove os valores em branco do começo e do fim da string


    }
}
