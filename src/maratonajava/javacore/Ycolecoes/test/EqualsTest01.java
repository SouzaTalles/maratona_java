package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Smartphone;
import org.w3c.dom.ls.LSOutput;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iphone");
        Smartphone s2 = new Smartphone("1ABC1", "iphone");
        System.out.println(s1.equals(s2));
    }
}
