package maratonajava.javacore.ZZHpadroesdeprojoetos.test;

import maratonajava.javacore.ZZHpadroesdeprojoetos.dominio.Country;
import maratonajava.javacore.ZZHpadroesdeprojoetos.dominio.Currency;
import maratonajava.javacore.ZZHpadroesdeprojoetos.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
