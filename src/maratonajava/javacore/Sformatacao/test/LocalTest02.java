package maratonajava.javacore.Sformatacao.test;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;

public class LocalTest02 {
    public static void main(String[] args) {
        // Saber a configuração do sistema
        System.out.println(Locale.getDefault());
        // Todas as ISO suportadas
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + " ");
        }
        System.out.println();
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");
        }
    }
}
