package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Willian Suane");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");

        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("C", "Letra C");
        map.put("E", "Letra E");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // métodos para comparação
        // lower < imediatamente menor
        // floor <= igual ou imediatamente menor
        // higher > imediatamente maior
        // ceiling >= igual ou imediatamente maior

        // retornar todos que estão acima do argumento passado
        // true para incluir a propria chave
        System.out.println(map.headMap("C", true));
        System.out.println(map.ceilingKey("C"));
        System.out.println(map.higherKey("C"));
        System.out.println(map.lowerKey("C"));
        System.out.println(map.floorEntry("C"));
    }
    // O TreeMap de NavigableMap vai ordenar pela chave.
    // Apenas a key precisa ter o Comparator ou o Comparable pra poder compilar
}
