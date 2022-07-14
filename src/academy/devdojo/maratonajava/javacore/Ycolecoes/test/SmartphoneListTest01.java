package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone sm1 = new Smartphone("1ABC1", "Iphone");
        Smartphone sm2 = new Smartphone("233332", "Samsung");
        Smartphone sm3 = new Smartphone("333333", "MONTOROLA");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(sm1);
        smartphones.add(sm2);
        smartphones.add(sm3);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
            System.out.println("------------------------------");
        }

        Smartphone sm4 = new Smartphone("12321412", "baianoCell");
        if (smartphones.indexOf(sm4) == -1) {
            smartphones.add(sm4);
            int index = smartphones.indexOf(sm4);
            System.out.printf("Index: %d\n", index);
            for (Smartphone smartphone : smartphones) {
                System.out.println(smartphone);
                System.out.println("------------------------------");
            }
        }
    }
}
