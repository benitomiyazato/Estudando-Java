package academy.devdojo.maratonajava.javacore.Ycolecoes.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String name;
    private double price;
    private int quantity;

    public Manga(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Manga(Long id, String name, double price, int quantity) {
        this(id, name, price);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Manga [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Manga manga = (Manga) obj;

        return Objects.equals(id, manga.getId()) && Objects.equals(name, manga.getName());
    }

    @Override
    public int compareTo(Manga otherManga) {
        // if (this < otherManga) return negativo;
        // if (this == otherManga) return 0;
        // if (this > otherManga) return positivo;

        // if (this.id < otherManga.getId()) {
        // return -1;
        // } else if (this.id.equals(otherManga.getId())) {
        // return 0;
        // } else {
        // return 1;
        // }

        return this.id.compareTo(otherManga.getId());
    }
}
