package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain;

public class Student {
    public String name;
    public int age;
    public char sex;

    public Student(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void displayData(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(sex);
    }
}

