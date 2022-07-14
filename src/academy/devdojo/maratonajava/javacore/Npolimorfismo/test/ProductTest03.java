package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.TaxCalculator;

public class ProductTest03 {
    public static void main(String[] args) {
        Computer computer = new Computer("DINO PC", 23);
        Tomate tomate = new Tomate("Tomate Verde", 23);
        tomate.setExpirationDate("21/04/2022");

        TaxCalculator.CalcTaxes(computer);
        TaxCalculator.CalcTaxes(tomate);
    }
}
