package maratonajava.javacore.Zgenerics.service;

import maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcoDisponiveis = new ArrayList<>(
            List.of(new Barco("Lancha"),
                    new Barco("canoa"))
    );

    public Barco buscarBarcoDisponivel() {
        System.out.println("Buscando barco disponível...");
        Barco barco = barcoDisponiveis.removeFirst();
        System.out.println("Alugando barco: " + barco);
        System.out.println("Barcos disponíveis para alugar: ");
        System.out.println(barcoDisponiveis);
        return barco;
    }

    public void retornarCarroAlugado(Barco barco) {
        System.out.println("Devolvendo barco: " + barco);
        barcoDisponiveis.add(barco);
        System.out.println("Barcos disponíveis para alugar");
        System.out.println(barcoDisponiveis);
    }
}
