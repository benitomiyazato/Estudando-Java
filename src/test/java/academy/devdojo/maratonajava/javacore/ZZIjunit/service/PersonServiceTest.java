package academy.devdojo.maratonajava.javacore.ZZIjunit.service;

import academy.devdojo.maratonajava.javacore.ZZIjunit.domain.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {

    @Test
    @DisplayName("A person shouldn't be adult when age is lower than 18")
    void isAdult_ReturnFalse_WhenAgeIsLowerThan18() {
        Person person = new Person(15);
        Assertions.assertFalse(PersonService.isAdult(person));
    }
}