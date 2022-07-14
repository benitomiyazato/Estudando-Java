package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.School;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Teacher;

public class SchoolTest01 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Baiano");
        Teacher teacher2 = new Teacher("Juliano");

        School school1 = new School("ETEC");

        school1.setTeachers(teacher1, teacher2);
        school1.printData();
    }
}
