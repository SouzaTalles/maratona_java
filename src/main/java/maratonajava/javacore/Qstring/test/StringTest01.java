package maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "William";//String constant pool
        String nome2 = "William";
        nome = nome.concat(" Suane"); // nome += " Suane"
        System.out.println(nome);
        System.out.println(nome == nome2); // usado para comparar referencia

        // Criando uma string no heap da mémoria e no pool de string
        String nome3 = new String("William"); // 1 variável de referência, 2 objeto do tipo string, 3 uma string no pool de string
        System.out.println(nome2 == nome3);// falso, pois fazem referência a lugares diferentes na memória
        System.out.println(nome2 == nome3.intern()); // se quiser pergar o valor da referência do pool de strng usa o intern()


    }
}
