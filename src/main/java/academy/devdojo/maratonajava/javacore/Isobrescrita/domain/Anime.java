package academy.devdojo.maratonajava.javacore.Isobrescrita.domain;

public class Anime {
    private String name;

    @Override
    public String toString() {
        return "Name: " + this.name;
    }

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}