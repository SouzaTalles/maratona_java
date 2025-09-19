package maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File
// FileWriter
// FileReader
// BufferedWriter
// BufferedReader
public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("O DeveDojo é o melhor curso do Brasil\nContinuado a cantoria no próxima linha\n");
            fw.flush(); // Escrever tudo no arquivo para poder fechar
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
