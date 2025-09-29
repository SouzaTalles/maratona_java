package maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");
        if (Files.notExists(pastaPath)) {
            // se o diretório já existir séra lançado um IOException
            // Cria a última pasta que está a ser indicada, não é possível criar se a pasta pai não existir
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }

        Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
        // não lança uma excessão se o diretório já existir
        // Cria todas a pasta que estão a ser indicados.
        Path subPastaDirectory = Files.createDirectories(subPastaPath);

        // Criando um file dentro do diretório
        // Se o file já existe será lançado uma excessão
        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");
        if (Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
        }

        // Copiando um file
        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renaded.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
