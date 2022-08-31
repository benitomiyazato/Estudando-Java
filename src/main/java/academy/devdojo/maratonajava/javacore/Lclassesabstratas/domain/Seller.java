package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public class Seller extends Employee {

    public Seller(String name, double earnings, double bonusConst) {
        super(name, earnings, bonusConst);
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nEarnings: " + this.earnings;
    }

    @Override
    public void calcDescount() {
        earnings -= earnings * 0.1;
    }

}
