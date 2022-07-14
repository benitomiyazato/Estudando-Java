package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Baiano");
        employee1.setAge(19);

        employee1.setEarnings(123,312,1523);
        employee1.printEarnings();
        employee1.printEarningsAverage();
    }
}
