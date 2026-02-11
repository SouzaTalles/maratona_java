package maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("O DeveDojo é o melhor curso do Brasil");
            bw.newLine();
            bw.flush(); // Escrever tudo no arquivo para poder fechar
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
