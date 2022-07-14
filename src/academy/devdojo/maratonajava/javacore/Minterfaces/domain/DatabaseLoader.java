package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Loading databases");
    }

    @Override
    public void remove() {
        System.out.println("Removing from database");
    }

    @Override
    public void checkPermission() {
        System.out.println("checando permissão");
    }
}
