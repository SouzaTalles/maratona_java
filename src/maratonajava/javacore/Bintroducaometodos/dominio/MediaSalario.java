package maratonajava.javacore.Bintroducaometodos.dominio;

public class MediaSalario {
    public void calculaMediaSalario(double[] salarios){
        if (salarios == null) {
            return;
        }

        double media = 0;

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Média salarial: " + media);
    }
}
