package maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    /**
     * Como o método é publico não é priciso uasar o try catch,
     * mas tá sendo usado o throws IOException para lançar a exceção
     * @throws IOException
     */
    public static void criarNovoArquivo() throws IOException{
        File file = new File("arquivo\\test.txt");
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
    }
}
