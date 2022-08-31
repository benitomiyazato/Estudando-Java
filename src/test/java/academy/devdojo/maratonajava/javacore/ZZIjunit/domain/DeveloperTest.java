package academy.devdojo.maratonajava.javacore.ZZIjunit.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {
    @Test
    public void instanceOf_ExecutesChildsClassMethod_WhenObjectIsSameTypeAsChild(){
        Employee employeeDeveloper = new Developer(1, "Java");
        if(employeeDeveloper instanceof Developer developer){
            Assertions.assertEquals("Java", developer.getMainLanguage());
        }
    }

}