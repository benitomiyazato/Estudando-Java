package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain;

public class Car {
    private String name;
    public static final double LIMIT_SPEED = 250;
    private final Buyer buyer = new Buyer("Baiano");

    public final void printData(){
        System.out.printf("Name: %s \n", this.name);
        System.out.printf("Buyer: %s \n", this.buyer.getName());
        System.out.printf("Limit Speed: %.1f\n", LIMIT_SPEED);
    }

    @Override
    public String toString() {
        return "Name:" + this.name + "\nName of Buyer:" + this.buyer.getName();
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
