package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Car;
import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Ship;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.RentalService;

public class GenericClassTest02 {
    public static void main(String[] args) {
        List<Car> availableCars = new ArrayList<>(List.of(new Car("BMW"), new Car("Fusca")));
        List<Ship> availableShips = new ArrayList<>(List.of(new Ship("Boat"), new Ship("Canoe")));

        RentalService<Car> rentalService = new RentalService<>(availableCars);
        RentalService<Ship> rentalService2 = new RentalService<>(availableShips);

        Car car = rentalService.searchAvailableObject();
        rentalService.retrieveRentObject(car);
        System.out.println("-----------------------");
        Ship ship = rentalService2.searchAvailableObject();
        rentalService2.retrieveRentObject(ship);
    }
}
