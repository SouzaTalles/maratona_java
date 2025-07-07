package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;
import maratonajava.javacore.Bintroducaometodos.dominio.MediaSalario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        MediaSalario mediaSalario = new MediaSalario();

        funcionario.nome = "Sanji";
        funcionario.idade = 23;
        funcionario.salarios = new double[]{1500, 1000, 2000};

        funcionario.imprime();

        mediaSalario.calculaMediaSalario(funcionario.salarios);
    }
}
