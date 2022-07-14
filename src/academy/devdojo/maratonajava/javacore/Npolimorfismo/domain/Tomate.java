package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Tomate extends Product {
    public static final double TAX_PERCENTAGE = 0.2;
    private String expirationDate;

    public Tomate(String name, double price) {
        super(name, price);
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double calcTaxes() {
        return this.price * TAX_PERCENTAGE;
    }
}
