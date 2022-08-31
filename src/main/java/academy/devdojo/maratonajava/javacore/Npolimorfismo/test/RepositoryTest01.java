package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.ArchiveRepository;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.DataBaseRepository;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.MemoryRepository;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.Repository;

public class RepositoryTest01 {
    public static void main(String[] args) {
        Repository repository = new MemoryRepository();
        Repository repository2 = new ArchiveRepository();
        Repository repository3 = new DataBaseRepository();

        repository.save();
        repository2.save();
        repository3.save();
    }
}
