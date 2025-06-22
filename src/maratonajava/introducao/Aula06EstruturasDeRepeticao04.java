package maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra quantas vezes ele pode ser parcelado
    // condição valor da parcela maior ou igual a 1000
    public static void main(String[] args) {
        double valorCarro = 30000;
        for (int parcela = (int) valorCarro; parcela >= 1; parcela--){
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$"+ valorParcela);
        }
    }
}
