package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Computer extends Product {
    public static final double TAX_PERCENTAGE = 0.25;

    public Computer(String name, double price) {
        super(name, price);
    }

    public double calcTaxes() {
        return this.price * TAX_PERCENTAGE;
    }

}
