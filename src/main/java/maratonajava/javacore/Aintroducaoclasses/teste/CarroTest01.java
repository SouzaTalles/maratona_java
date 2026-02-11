package maratonajava.javacore.Aintroducaoclasses.teste;

import maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca";
        carro1.ano = 2000;
        carro1.modelo = "Sport";

        carro1 = carro2; // refêrencia a mesma memória

        carro2.nome = "Triton";
        carro2.ano = 2020;
        carro2.modelo = "Savana";

        System.out.println("Carro 1:");
        System.out.println("Carro: " + carro1.nome + ", ano: " + carro1.ano + ", modelo: " + carro1.modelo);

        System.out.println("-------------------");

        System.out.println("Carro 2:");
        System.out.println("Carro: " + carro2.nome + ", ano: " + carro2.ano + ", modelo: " + carro2.modelo);
    }
}

