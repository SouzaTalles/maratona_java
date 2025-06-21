package maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 catgoria infantil
        // idade >= 15 && idade < 18 juvenil
        // idade >= 18 categotia adulto
        int idade = 12;
        String categoria;
        if (idade < 15) {
            categoria ="Catgoria infantil";
        }else if(idade >= 15 && idade < 18){
            categoria = "categoria juvenil";
        }else{
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);
    }
}
