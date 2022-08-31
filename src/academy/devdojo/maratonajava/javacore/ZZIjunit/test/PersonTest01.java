package academy.devdojo.maratonajava.javacore.ZZIjunit.test;

import academy.devdojo.maratonajava.javacore.ZZIjunit.domain.Person;
import academy.devdojo.maratonajava.javacore.ZZIjunit.service.PersonService;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person(19);
        System.out.println(PersonService.isAdult(person));
    }
}
