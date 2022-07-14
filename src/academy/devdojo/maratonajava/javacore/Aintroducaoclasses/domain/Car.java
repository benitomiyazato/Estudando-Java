package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain;

public class Car {
    public String name, model;
    public int year;

    public void displayInfo(){
        System.out.printf("Nome do carro: %s\n", name);
        System.out.printf("Modelo do carro: %s\n", model);
        System.out.printf("Ano do carro: %d\n", year);
        System.out.println("--------------------------------");
    }
}
