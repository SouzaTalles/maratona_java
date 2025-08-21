package maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long lonP = 10L;
        float floatP = 10f;
        double doubleP = 10D;
        char charP = 'w';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // autoboxing
        Long lonW = 10L;
        Float floatW = 10f;
        Double doubleW = 10D;
        Character charW = 'w';
        Boolean booleanW = false;

        // Transformando um tipo wrapper em um tipo primitivo
        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("true");

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));

        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
