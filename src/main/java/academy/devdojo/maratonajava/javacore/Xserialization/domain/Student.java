package academy.devdojo.maratonajava.javacore.Xserialization.domain;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {
    private Long id;
    private String name;
    private transient String password; // transient não será serializado
    private static String schoolName = "DevDojo"; // atributos static também nao serao serializados, ja que nao sao
                                                  // instanciados
    private Turma turma; // pode nao ser serializável --> turma deveria implementar Serializable

    public Student(Long id, String name, String password, Turma turma) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.turma = turma;
    }

    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNomeTurma());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String turmaNome = ois.readUTF();
            this.turma = new Turma(turmaNome);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", password=" + password + ", school name=" + schoolName
                + ", turma=" + turma + "]";
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        Student.schoolName = schoolName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
