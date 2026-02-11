package maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest03 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    /**
     * Nesse método tá acontenco uma hibridização entre o try catch e throw IOException
     */
    public static void criarNovoArquivo() throws IOException{
        File file = new File("arquivo\\test.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
