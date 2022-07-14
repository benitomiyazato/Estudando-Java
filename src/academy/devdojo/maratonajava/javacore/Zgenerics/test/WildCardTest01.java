package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import javax.xml.catalog.Catalog;

abstract class Animal {
    public abstract void consulta();
}

class Dog extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando o cachorro");
    }
}

class Cat extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando o gato");
    }
}

public class WildCardTest01 {
    public static void main(String[] args) {
        Dog[] dogs = { new Dog(), new Dog() };
        Cat[] cats = { new Cat(), new Cat() };

        // Animal[] animals = {new Dog(), new Dog(), new Cat(), new Cat()};
        printConsulta(dogs);
        printConsulta(cats);
        
    }

    private static void printConsulta(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
}
