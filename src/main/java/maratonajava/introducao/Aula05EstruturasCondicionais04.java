package maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double valorImpostoPago;

        if (salarioAnual <= 34712){
            valorImpostoPago = (salarioAnual * 9.70) / 100;
        }else if (salarioAnual >= 34713 && salarioAnual <= 68507){
            valorImpostoPago = (salarioAnual * 37.35) / 100;
        }else{
            valorImpostoPago = (salarioAnual * 49.50) / 100;
        }

        System.out.println(valorImpostoPago);
    }
}
