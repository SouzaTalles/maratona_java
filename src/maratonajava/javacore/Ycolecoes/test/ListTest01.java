package maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16); // 1.5
        List<String> nomes2 = new ArrayList<>(16); // 1.5
        nomes.add("William");
        nomes.add("DeveDojo Academy");
        nomes2.add("Suane");
        nomes2.add("Academy");
        nomes2.add("William");

//        nomes.remove("William");

        // dicionar uma lista em outra sem repetir os valores
        for (String s : nomes2) {
            if (!nomes.contains(s)) {
                nomes.add(s);
            }
        }

        // adicionando os valores de uma lista em outra
//        nomes.addAll(nomes2);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("-------------");

        int size = nomes.size();
        for (int i = 0; i < size; i++) {
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
