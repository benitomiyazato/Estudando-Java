package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("black", 2011), new Car("red", 1998), new Car("green", 1945));

    public static void main(String[] args) {
        List<Car> blackCars = filterCars(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("black");
            }

        });

        List<Car> redCars = filterCars(cars, car -> car.getColor().equals("red"));
        List<Car> before2011Cars = filterCars(cars, car -> car.getYear() < 2011);
        System.out.println(redCars);
        System.out.println(blackCars);
        System.out.println(before2011Cars);

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> evenNumbers = filter(nums, num -> num % 2 == 0);
        System.out.println(evenNumbers);
    }

    private static List<Car> filterCars(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }
}
