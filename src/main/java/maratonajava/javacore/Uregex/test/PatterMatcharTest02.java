package maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcharTest02 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-zA-Z, dígitos, _
        // \W = Tudo o que não for incluso no \w
        String regex = "\\W";
//        String texto = "abaaba";
        String texto2 = "@#hh_j2 12gvh21";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto:  " + texto2);
        System.out.println("índice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("posições encontradas: " + regex);
        while ((matcher.find())) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
