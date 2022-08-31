package academy.devdojo.maratonajava.javacore.ZZIjunit.service;

import academy.devdojo.maratonajava.javacore.ZZIjunit.domain.Person;

import java.util.Objects;

public class PersonService {
    public static boolean isAdult(Person person) {
        Objects.requireNonNull(person, "Person can't be null");
        return person.getAge() >= 18;
    }
}
