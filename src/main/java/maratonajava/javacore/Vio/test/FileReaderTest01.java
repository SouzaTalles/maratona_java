package maratonajava.javacore.Vio.test;

import java.io.*;

public class FileReaderTest01 {
    public static void main(String[] args)  {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file)) {
//            char[] in = new char[1000];
//            int read = fr.read(in); // read com a quantidade de caracteres que ele leu
//            System.out.println(read);
//            for (char c : in) {
//                System.out.print(c);
//            }
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
