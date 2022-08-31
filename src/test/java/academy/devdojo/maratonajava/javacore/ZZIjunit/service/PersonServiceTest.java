package academy.devdojo.maratonajava.javacore.ZZIjunit.service;

import academy.devdojo.maratonajava.javacore.ZZIjunit.domain.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {
    private Person adult;
    private Person notAdult;

    @BeforeEach
    public void setUp() {
        adult = new Person(18);
        notAdult = new Person(17);
    }

    @Test
    @DisplayName("A person shouldn't be adult when age is lower than 18")
    void isAdult_ReturnsFalse_WhenAgeIsLowerThan18() {
        Assertions.assertFalse(PersonService.isAdult(notAdult));
    }

    @Test
    @DisplayName("A person should be adult when age is greater or equal to 18")
    void isAdult_ReturnsTrue_WhenAgeIsGreaterOrEqualThan18() {
        Assertions.assertTrue(PersonService.isAdult(adult));
    }

    @Test
    @DisplayName("Should throw NullPointerException if person is NULL")
    void isAdult_ThrowsException_WhenPersonIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> PersonService.isAdult(null));
    }

    @Test
    @DisplayName("Should return a list of only adult people")
    void filterRemovingNotAdults_ReturnsListWithOnlyAdults_WhenGivenListOfPeople() {
        Person person1 = new Person(15);
        Person person2 = new Person(17);
        Person person3 = new Person(18);
        Person person4 = new Person(21);

        List<Person> personList = List.of(person1, person2, person3, person4);
        List<Person> filteredPersonlist = List.of(person3, person4);
        Assertions.assertEquals(filteredPersonlist, PersonService.filterRemovingNotAdults(personList));
    }
}
