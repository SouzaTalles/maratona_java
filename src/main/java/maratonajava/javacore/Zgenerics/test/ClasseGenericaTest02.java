package maratonajava.javacore.Zgenerics.test;

import maratonajava.javacore.Zgenerics.dominio.Barco;
import maratonajava.javacore.Zgenerics.service.BarcoRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por uma mês...");
        barcoRentavelService.retornarCarroAlugado(barco);
    }
}
