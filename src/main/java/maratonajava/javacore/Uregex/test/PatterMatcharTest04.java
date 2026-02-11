package maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcharTest04 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-zA-Z, dígitos, _
        // \W = Tudo o que não for incluso no \w
        // [] O que tem dentro é considerado um range de caracteres, ele vai procurar o que tem dentro dos colchetes
        // [a-z] assim pega todas as minúsculas de 'a' até 'z'
        // EX :String regex = "[a-zA-C]";

        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        //{n,m} de n até m
        // () agrupamento
        // | ou
        // EX: o(v|c)o == ovo | oco
        // $ fim da linha
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  " + texto);
        System.out.println("índice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("posições encontradas: " + regex);
        while ((matcher.find())) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
