package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.Aircraft;
import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.Country;
import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.Currency;
import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.CurrencyFactory;
import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.Person;
import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.ReportDto;

public class ReportDtoTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("Boeng 777");
        Person person = new Person.PersonBuilder().firstName("Baiano").build();
        Country brazil = Country.BRAZIL;
        Currency brazilCurrency = CurrencyFactory.newCurrency(brazil);

        ReportDto report = ReportDto.ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .country(brazil)
                .currency(brazilCurrency)
                .personName(person.getFirstName())
                .build();

        System.out.println(report);

    }
}
