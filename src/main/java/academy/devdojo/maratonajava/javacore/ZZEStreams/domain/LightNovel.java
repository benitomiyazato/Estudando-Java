package academy.devdojo.maratonajava.javacore.ZZEStreams.domain;

import java.util.Objects;

public class LightNovel {
    private String title;
    private double price;
    private Category category;

    public void setCategory(Category category) {
        this.category = category;
    }

    public LightNovel(String title, double price, Category category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }

    public LightNovel(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "LightNovel [category=" + category + ", price=" + price + ", title=" + title + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LightNovel other = (LightNovel) obj;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        return true;
    }
}
