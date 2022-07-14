package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Manager;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Seller;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager01 = new Manager("Luffy", 7000, 0.1);
        Seller seller01 = new Seller("Nami", 3500, 0.2);
        System.out.println(manager01);
        System.out.println(seller01);
    }
}
