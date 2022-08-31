package academy.devdojo.maratonajava.javacore.Xserialization.test;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import academy.devdojo.maratonajava.javacore.Xserialization.domain.Student;
import academy.devdojo.maratonajava.javacore.Xserialization.domain.Turma;

public class SerializationTest01 {
    public static void main(String[] args) {
        Turma turma = new Turma("baianoSchool");
        Student student1 = new Student(12391274L, "baiano", "carrospotentes123", turma);
        // serialize(student1);
        desserialize(); // Desserialização não executa o Construtor da Classe
    }

    private static void serialize(Student student) {
        Path path = Paths.get("serializepasta/aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void desserialize() {
        Path path = Paths.get("serializepasta/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Student student = (Student) ois.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
