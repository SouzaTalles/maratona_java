package maratonajava.javacore.ZZHpadroesdeprojoetos.test;

import maratonajava.javacore.ZZHpadroesdeprojoetos.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = Person.PersonBuilder
                .builder()
                .firstName("Talles")
                .lastName("Souza")
                .userName("Mileto")
                .email("talles@gmail.com")
                .build();
        System.out.println(build);
    }
}
