package maratonajava.javacore.Minterface.dominio;

public class DatabaseLoader implements DataLoader, DateRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermissions() {
        System.out.println("Checando permissões no banco de dados");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na classe DatabaseLoader");
    }
}
