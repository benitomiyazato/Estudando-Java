package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car01 = new Car("Evo");
        System.out.println("Limit Speed: " + Car.LIMIT_SPEED);
        car01.setName("R35");
        System.out.println(car01);
    }
}
