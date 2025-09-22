package maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTesst02 {
    public static void main(String[] args) throws IOException {
        // criação de um diretorio
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println("Diretorio criado: " + isDiretorioCreated);

        // criando um file dentro do diretorio
        File fileArquivoDiretorio = new File("C:\\Users\\talle\\Documents\\maratona_java\\pasta\\arquivo.txt");
//        outra forma de criar o arquivo dentro do diretorio:
//        File fileArquivoDiretorio1 = new File(fileDiretorio, "arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("Arquivo criado: " + isFileCreated);

        // renomeando o arquivo
        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("Arquivo renomeado: " + isRenamed);

        // Renomear diretorio
        File diretorioRenamed = new File("pasta2");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Diretorio renomeado: " + isDiretorioRenamed);
    }
}
