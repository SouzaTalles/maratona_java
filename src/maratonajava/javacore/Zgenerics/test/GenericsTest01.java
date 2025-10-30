package maratonajava.javacore.Zgenerics.test;

import maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Maratona");
        lista.add("Java");

        for (String s : lista) {
            System.out.println(s);
        }

        add(lista, new Consumidor("Talles"));

        for (String s : lista) {
            System.out.println(s);
        }
    }

    private static void add(List lista, Consumidor consumidor) {
        lista.add(consumidor);
    }
}
