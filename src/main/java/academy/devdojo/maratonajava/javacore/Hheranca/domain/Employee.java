package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Employee extends Person {
    private double earnings;

    public Employee(String name) {
        super(name);
    }

    public Employee(String name, double earnings) {
        this(name);
        this.earnings = earnings;
    }

    public void printData() {
        super.printData();
        System.out.printf("Earnings: %.2f\n", this.earnings);
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }
}
