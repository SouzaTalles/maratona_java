package maratonajava.javacore.Gassociacao.exercicio.test;

import maratonajava.javacore.Gassociacao.exercicio.dominio.Aluno;
import maratonajava.javacore.Gassociacao.exercicio.dominio.Local;
import maratonajava.javacore.Gassociacao.exercicio.dominio.Professor;
import maratonajava.javacore.Gassociacao.exercicio.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua Edmar Herculano");
        Aluno aluno1 = new Aluno("Paulo", 18);
        Aluno aluno2 = new Aluno("Ana", 19);

        Aluno[] alunos = {aluno1, aluno2};

        Seminario seminario1 = new Seminario("Python", alunos, local);
        Seminario[] seminarios = {seminario1};

        Professor professor1 = new Professor("Marcos", "POO", seminarios);

        professor1.imprime();
    }
}
