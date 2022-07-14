package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Television extends Product {
    public static final double TAX_PERCENTAGE = 0.25;

    public Television(String name, double price) {
        super(name, price);
    }

    @Override
    public double calcTaxes() {
        return this.price * TAX_PERCENTAGE;
    }
}
