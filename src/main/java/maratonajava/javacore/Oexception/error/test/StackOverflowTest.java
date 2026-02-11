package maratonajava.javacore.Oexception.error.test;

public class StackOverflowTest {
    public static void main(String[] args) {
        recusividade();
    }

    public static void recusividade() {
        recusividade();
    }
}
