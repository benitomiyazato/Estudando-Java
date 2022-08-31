package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product1 = new Computer("DINO PC", 23);
        Product product2 = new Tomate("Verde", 23);

        System.out.printf("Tax: %.2f\n", product1.calcTaxes());
        System.out.printf("Tax: %.2f\n", product2.calcTaxes());



    }
}
