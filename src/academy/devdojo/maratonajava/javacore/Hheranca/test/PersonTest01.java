package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Adress;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Employee;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Adress adress01 = new Adress();
        adress01.setStreet("Praça Dona Mariquinha Sciascia");
        adress01.setCep("02372-050");
        Person person01 = new Person("Baiano");
        person01.setAdress(adress01);
        person01.setCpf("528.690.308-86");
        person01.printData();

        Employee employee01 = new Employee("Linguine");
        employee01.setAdress(adress01);
        employee01.setCpf("101.171.018-85");
        employee01.setEarnings(7728.88);
        employee01.printData();

    }
}
