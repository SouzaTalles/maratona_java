package maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcharTest05 {
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
        // . 1.3 = 123, 133, 1@3, 1A3
        // ^ inicio da linha ou negação quando ta entre []

        // https://regexr.com/ site para facilitar as expressões regulares
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail ";
        System.out.println("Email valido");
        System.out.println("#@!zoro@mail.br".matches(regex));
        System.out.println("zoro@mail.br".matches(regex));
        System.out.println((texto.split(",")[1].trim()));
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
