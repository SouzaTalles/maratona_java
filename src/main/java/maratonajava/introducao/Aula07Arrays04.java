package maratonajava.introducao;

public class Aula07Arrays04 {
    public static void main(String[] args) {
        int[] numeros = new int[3]; // 1ª forma de inicializar
        int[] numeros2 = {1,2,3,4,5}; // 2ª forma de inicializar
        int[] numeros3 = new int[]{5,4,3,2,1}; // 3ª forma de inicializar

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros2[i]);
        }

        for (int num : numeros3){
            System.out.println(num);
        }
    }
}
