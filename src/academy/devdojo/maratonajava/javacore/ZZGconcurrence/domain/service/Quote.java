package academy.devdojo.maratonajava.javacore.ZZGconcurrence.domain.service;

//storeName:price:discount
public class Quote {
    private final String storeName;
    private final double price;
    private final Discount.Code discount;

    private Quote(String storeName, double price, Discount.Code discount) {
        this.storeName = storeName;
        this.price = price;
        this.discount = discount;
    }

    public static Quote newQuote(String value) {
        String[] split = value.split(":");
        return new Quote(split[0], Double.parseDouble(split[1]), Discount.Code.valueOf(split[2]));
    }

    public String getStoreName() {
        return storeName;
    }

    public double getPrice() {
        return price;
    }

    public Discount.Code getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Quote [discount=" + discount + ", price=" + price + ", storeName=" + storeName + "]";
    }

}
