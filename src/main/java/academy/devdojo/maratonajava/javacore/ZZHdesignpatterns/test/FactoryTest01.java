package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.Country;
import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.Currency;
import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.CurrencyFactory;

public class FactoryTest01 {
    public static void main(String[] args) {
        Currency brazilCurrency = CurrencyFactory.newCurrency(Country.BRAZIL);
        
    }
}
