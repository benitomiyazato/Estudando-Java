package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain;

public class Buyer {
    private String name;

    @Override
    public String toString() {
        return "Name:" + this.name;
    }

    public Buyer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
