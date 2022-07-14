package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

import java.util.ArrayList;

public class School {
    private String name;
    private ArrayList<Teacher> teachers = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }

    public School(String name, Teacher... teachers) {
        this.name = name;
        for (int i = 0; i < teachers.length; i++) {
            this.teachers.add(teachers[i]);
        }
    }

    public void printData() {
        System.out.println("Name: " + this.name);
        if (teachers == null) {
            System.out.println("This school has no teachers");
            return;
        }
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getName());
        }

    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeachers(Teacher... teachers) {
        for (int i = 0; i < teachers.length; i++) {
            this.teachers.add(teachers[i]);
        }
    }

}
