package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Car;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.RentalCarService;

public class GenericClassTest01 {
    public static void main(String[] args) {
        RentalCarService profitableCarService = new RentalCarService();
        Car car = profitableCarService.searchAvailableCar();
        System.out.println("Usando o carro por um mês....");
        profitableCarService.retrieveRentCar(car);        
    }
}
