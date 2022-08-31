package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class StudentPrinter {
    public void printData(Student student){
        System.out.println("-------------------");

        System.out.println("Name: "+ student.name);
        System.out.println("Sex: "+ student.sex);
        System.out.println("Age: "+ student.age);
    }
}
