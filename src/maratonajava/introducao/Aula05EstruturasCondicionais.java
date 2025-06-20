package maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadiComprarBebida = idade >= 18;
        // ! (not)
        if(isAutorizadiComprarBebida){
            System.out.println("Autorizado a comprar bebida alcólica");
        }

        if (!isAutorizadiComprarBebida){
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        System.out.println("Fora do if");
    }
}
