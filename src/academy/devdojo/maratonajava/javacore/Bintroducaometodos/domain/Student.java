package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Student {
    public String name;
    public int age;
    public char sex;
   
    public Student(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void print(){
         System.out.printf("Name: %s \n", this.name);
         System.out.printf("Sex: %c \n", this.sex);
         System.out.printf("Age: %d \n", this.age);
         System.out.println("---------------------------");
    }
}
