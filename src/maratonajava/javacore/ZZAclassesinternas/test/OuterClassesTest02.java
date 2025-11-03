package maratonajava.javacore.ZZAclassesinternas.test;

import org.w3c.dom.ls.LSOutput;

public class OuterClassesTest02 {
    private String name = "Modoriya";

    // Classes locais é quando tem uma classe dentro de um método
    void print(final String param) {
        // dentro da classe local os atributos e parâmetro precisam ser finais ou efetivamente final
        final String lastName = "Izuku";
        class LocalClass {
            public void printLocal() {
                System.out.println(param);
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("");
    }
}
