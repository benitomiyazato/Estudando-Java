package academy.devdojo.maratonajava.javacore.ZZIjunit.service;

import academy.devdojo.maratonajava.javacore.ZZIjunit.domain.Person;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PersonService {
    public static boolean isAdult(Person person) {
        Objects.requireNonNull(person, "Person can't be null");
        return person.getAge() >= 18;
    }

    public static List<Person> filterRemovingNotAdults(List<Person> personList) {
        return personList.stream().filter(PersonService::isAdult).collect(Collectors.toList());
    }
}
