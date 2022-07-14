package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        printConsulta(dogs);
        printConsulta(cats);
        printConsultaAnimal(animals);
    }

    private static void printConsulta(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    private static void printConsultaAnimal(List<? super Animal> animals) {
        animals.add(new Dog());
        animals.add(new Cat());
        for (Object object : animals) {
            System.out.println(object);
        }
    }
}
