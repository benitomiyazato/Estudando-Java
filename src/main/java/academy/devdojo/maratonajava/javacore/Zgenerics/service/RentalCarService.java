package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Car;

public class RentalCarService {
    private List<Car> availableCars = new ArrayList<>(List.of(new Car("BMW"), new Car("Fusca")));

    public Car searchAvailableCar() {
        System.out.println("Buscando carro disponível.....");
        Car c = availableCars.remove(0);
        System.out.println("Alugando carro " + c);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(availableCars);
        return c;
    }

    public void retrieveRentCar(Car car) {
        System.out.println("Devolvendo carro: " + car);
        availableCars.add(car);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(availableCars);
    }
}
