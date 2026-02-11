package maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(1, 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param a
     * @param b Não pode ser 0.
     * @return
     * @throws IllegalArgumentException caso b seja 0.
     */
    private static int divisao(int a, int b) throws IllegalArgumentException {
        if (b == 0) { // com isso não é preciso o try {} catch {}
            throw new IllegalArgumentException("Argumento ilegal, não pode ser zero");
        }
        return a / b;
    }
}
