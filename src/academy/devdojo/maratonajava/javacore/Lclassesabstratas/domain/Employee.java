package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public abstract class Employee extends Person {
    protected String name;
    protected double earnings;
    private double bonusConst;

    public Employee(String name, double earnings, double bonusConst) {
        this.name = name;
        this.earnings = earnings;
        this.bonusConst = bonusConst;
    }
    public void calcBonus() {
        this.earnings += earnings * bonusConst;
    }

    @Override
    public void print() {
    }

    public abstract void calcDescount();
}
