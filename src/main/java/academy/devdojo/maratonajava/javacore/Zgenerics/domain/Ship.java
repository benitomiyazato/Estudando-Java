package academy.devdojo.maratonajava.javacore.Zgenerics.domain;

public class Ship {
    private String name;

    public Ship(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ship [name=" + name + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
