package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public abstract class Product implements Taxable {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}
