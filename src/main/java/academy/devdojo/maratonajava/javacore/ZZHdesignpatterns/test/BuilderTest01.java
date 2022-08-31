package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.Person;

public class BuilderTest01 {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .firstName("Baiano")
                .lastName("Linguine")
                .username("EnderCraft_BR")
                .email("perdiomeusave@gmail.com")
                .build();

        System.out.println(person);
    }

}
