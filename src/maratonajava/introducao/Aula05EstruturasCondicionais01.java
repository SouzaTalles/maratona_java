package maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 10;
        boolean isAutorizadiComprarBebida = idade >= 18;
        // ! (not)
        if(isAutorizadiComprarBebida){
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        if (!isAutorizadiComprarBebida){
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        boolean c = false;
        if(c == true){
            System.out.println("Dentro do algo que nunca deve ser feito");
        }

        System.out.println("Fora do if");
    }
}
