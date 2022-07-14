package academy.devdojo.maratonajava.javacore.Fmodificadorstatic.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorstatic.domain.Car;

public class CarroTest01 {
    public static void main(String[] args) {
        Car car01 = new Car("Porsche", 290);
        Car car02 = new Car("BMW", 280);
        Car car03 = new Car("Mecha", 285);
        
        Car.setLimitSpeed(180);

        car01.printData();
        car02.printData();
        car03.printData();

    }
}
