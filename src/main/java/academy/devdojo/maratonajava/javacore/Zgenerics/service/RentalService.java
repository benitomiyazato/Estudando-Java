package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import java.util.List;

public class RentalService<T> {
    private List<T> availableObjects;

    public RentalService(List<T> availableObjects) {
        this.availableObjects = availableObjects;
    }

    public T searchAvailableObject() {
        System.out.println("Buscando objeto disponível.....");
        T t = availableObjects.remove(0);
        System.out.println("Alugando objeto " + t);
        System.out.println("Objetos disponíveis para alugar: ");
        System.out.println(availableObjects);
        return t;
    }

    public void retrieveRentObject(T t) {
        System.out.println("Devolvendo objeto: " + t);
        availableObjects.add(t);
        System.out.println("Objetos disponíveis para alugar: ");
        System.out.println(availableObjects);
    }
}
