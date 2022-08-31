package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain;

public class CurrencyFactory {
    public static Currency newCurrency(Country country) {
        switch (country) {
            case BRAZIL:
                return new Real();
            case USA:
                return new usDollar();
            default:
                throw new IllegalArgumentException("NO currency found for the specified country");
        }
    }
}
