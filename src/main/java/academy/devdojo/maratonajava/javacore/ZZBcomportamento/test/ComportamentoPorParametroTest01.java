package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("black", 2011), new Car("orange", 1998), new Car("green", 1945));

    public static void main(String[] args) {
        System.out.println(filterCarByColor("green", cars));
        System.out.println(filterCarByYearBefore(2010, cars));
    }

    private static List<Car> filterCarByColor(String color, List<Car> cars) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    private static List<Car> filterCarByYearBefore(int year, List<Car> cars) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}
