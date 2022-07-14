package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Teacher {
    private String name;
    School school;

    public Teacher(String name, School school) {
        this.name = name;
        this.school = school;
    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
