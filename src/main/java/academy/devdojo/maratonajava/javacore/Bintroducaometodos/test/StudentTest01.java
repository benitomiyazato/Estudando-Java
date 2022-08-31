package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {

        Student student1 = new Student("Baiano", 19, 'm');
        Student student2 = new Student("Linguine", 17, 'm');

        student1.print();
        student2.print();
    }
}
