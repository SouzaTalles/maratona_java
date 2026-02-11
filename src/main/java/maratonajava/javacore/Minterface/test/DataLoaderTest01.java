package maratonajava.javacore.Minterface.test;

import maratonajava.javacore.Minterface.dominio.DataLoader;
import maratonajava.javacore.Minterface.dominio.DatabaseLoader;
import maratonajava.javacore.Minterface.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader datebaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        datebaseLoader.load();
        fileLoader.load();

        datebaseLoader.remove();
        fileLoader.remove();

        datebaseLoader.checkPermissions();
        fileLoader.checkPermissions();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
