package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;
import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
    
        car1.name = "Fusca";
        car1.model = "Sport";
        car1.year = 1969;
    
        car2.name = "Mustang";
        car2.model = "GT 500";
        car2.year = 1968;
    
        car1.displayInfo(); 
        car2.displayInfo();
    }
}
