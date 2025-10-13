package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("22222", "Pixel");
        Smartphone s3 = new Smartphone("33333", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3); // adicionando em um lugar especifico da lista de smartphone
//        smartphones.clear();  // deleta todos que estão dentro do ArrayList

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }
        Smartphone s4 = new Smartphone("22222", "Pixel");

        System.out.println(smartphones.contains(s4));
        int indexSmartphone4 = smartphones.indexOf(s4); // retorna -1 se não tiver o valor na lista
        System.out.println(smartphones.get(indexSmartphone4));
    }
}
