package academy.devdojo.maratonajava.javacore.ZZAinnerclasses.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Ship;

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Ship> shipList = new ArrayList<>(List.of(new Ship("Lancha"), new Ship("Canoa")));

        System.out.println("Lista antes: ");
        System.out.println(shipList);
        System.out.println("---------------");
        shipList.sort(new Comparator<Ship>() {

            @Override
            public int compare(Ship o1, Ship o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Lista depois: ");
        System.out.println(shipList);
    }
}
