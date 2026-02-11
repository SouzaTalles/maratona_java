package maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double 0
        // char '\u0000'''
        // bollean false
        // String null

        String[] nomes = new String[4];
        nomes[0] = "Talles";
        nomes[1] = "Marcos";
        nomes[2] = "Maria";
        nomes[3] = "Ana";

        for (int i = 0; i < nomes.length ; i++){
            System.out.println(nomes[i]);
        }

        nomes = new String[4];
    }
}
