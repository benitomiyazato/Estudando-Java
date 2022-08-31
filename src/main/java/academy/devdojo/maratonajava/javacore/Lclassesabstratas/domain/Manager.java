package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public class Manager extends Employee {

    public Manager(String name, double earnings, double bonusConst) {
        super(name, earnings, bonusConst);
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nEarnings: " + this.earnings;
    }

    public void calcDescount() {
        earnings -= earnings * 0.2;
    }

}
