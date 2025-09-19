package maratonajava.javacore.Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferFileReaderTest01 {
    public static void main(String[] args)  {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file);
             BufferedReader bw = new BufferedReader(fr)) {
            String line;
            while ((line = bw.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
