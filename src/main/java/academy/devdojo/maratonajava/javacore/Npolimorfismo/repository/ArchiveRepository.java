package academy.devdojo.maratonajava.javacore.Npolimorfismo.repository;

public class ArchiveRepository implements Repository {

    @Override
    public void save() {
        System.out.println("Salvando Archive Repository");
    }
}
