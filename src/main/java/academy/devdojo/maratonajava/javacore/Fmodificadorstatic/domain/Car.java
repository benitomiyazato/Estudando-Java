package academy.devdojo.maratonajava.javacore.Fmodificadorstatic.domain;

public class Car {
    private String name;
    private double maxSpeed;
    private static double limitSpeed = 250;

    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void printData() {
        System.out.println("--------------------");
        System.out.println("Name: " + this.name);
        System.out.println("Max Speed: " + this.maxSpeed);
        System.out.println("Limit Speed: " + limitSpeed);
    }

    public String getName() {
        return name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public static double getLimitSpeed() {
        return Car.limitSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public static void setLimitSpeed(double limitSpeed) {
        Car.limitSpeed = limitSpeed;
    }
}
