package maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        // int[] variável = arrays
        int[] idades = new int[3]; // Do tipo reference igual a String
        // new int[3] -> 3 objetos na memória
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
