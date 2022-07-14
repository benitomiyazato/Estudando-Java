package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Car;

public class GenericMethodTest01 {
    public static void main(String[] args) {
        Car car = new Car("ASDAD");
        Car car2 = new Car("BSBSBSB");
        List<Car> listA = returnObjectArray(car, car2);
        System.out.println(listA);
    }

    private static <T> List<T> returnObjectArray(T t, T t2) {
        List<T> list = List.of(t, t2);
        return list;
    }
}
