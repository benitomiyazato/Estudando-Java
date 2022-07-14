package academy.devdojo.maratonajava.javacore.Npolimorfismo.repository;

public class MemoryRepository implements Repository {

    @Override
    public void save() {
        System.out.println("Salvando Memory Repository");
    }

}
