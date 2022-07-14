package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Television;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.TaxCalculator;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("DINO PC", 3000);
        Tomate tomate = new Tomate("Tomate Vermelho", 3.50);
        Television television = new Television("LG TV", 2500);

        TaxCalculator.CalcTaxes(computer);
        TaxCalculator.CalcTaxes(tomate);
        TaxCalculator.CalcTaxes(television);
    }
}
