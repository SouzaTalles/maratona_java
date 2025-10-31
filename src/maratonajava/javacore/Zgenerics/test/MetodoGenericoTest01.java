package maratonajava.javacore.Zgenerics.test;

import maratonajava.javacore.Zgenerics.dominio.Barco;
import maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa Marota"));
        System.out.println(barcoList);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);
    }

//    private static <T> void criarArrayComUmObjeto(T t) {
//        return List.of(t);
//    }

//    private static <T extends Comparable<T>> List<T> criarArrayComUmObjeto(T t) {
//        return List.of(t);
//    }
}

//class DoisAtributos<T,X,I> {
//    private T t;
//    private X x;
//    private I i;
//}
